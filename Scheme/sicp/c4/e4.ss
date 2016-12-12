(define (eval exp env)
  (cond ((self-evaluating? exp) exp)
        ((variable? exp) (lookup-variable-value exp env))
	((quoted? exp) (text-of-quotation exp))
	((assignment? exp) (eval-assignment exp env))
	((definition? exp) (eval-definition exp env))
	((if? exp) (eval-if exp env))
	((lambda? exp)
	  (make-procedure (lambda-parameters exp)
			  (lambda-body exp)
			  env))
	((begin? exp)
	  (eval-sequence (begin-actions exp) env))
	((cond? exp) (eval (cond->if exp) env))
	((application? exp)
	  (apply (eval (operator exp) env)
		 (list-of-values (operands exp) env)))
	(else (error "Unknown expression type -- EVAL" exp))))

(define (self-evaluating? exp)
    (cond ((number? exp) #t)
	  ((string? exp) #t)
	  (else #f)))

(define (variable? exp) (symbol? exp))

(define the-empty-environment '())

(define (enclosing-environment env) (cdr env))

(define (first-frame env) (car env))

(define (frame-variables frame) (car frame))

(define (frame-values frame) (cdr frame))

(define (lookup-variable-value var env)
    (define (env-loop env)
	(define (scan vars vals)
	    (cond ((null? vars)
		   (env-loop (enclosing-environment env)))
		  ((eq? var (car vars))
		   (car vals))
		  (else (scan (cdr vars) (cdr vals)))))
    	(if (eq? env the-empty-environment)
	    (error "Unbound variable" var)
 	    (let ((frame (first-frame env)))
	   	(scan (frame-variables frame)
		      (frame-values frame)))))
    (env-loop env))

(define (tagged-list exp tag)
    (if (pair? exp)
	(eq? (car exp) tag)
	false))

(define (quoted? exp)
    (tagged-list exp 'quote))

(define (text-of-quotation exp) (cadr exp))

(define (assignment? exp) (tagged-list exp 'set!))

(define (eval-assignment exp) 
    (set-variable-value! (assignment-variable exp)
			 (eval (assignment-value exp) env)
			 env)
    'ok)

(define (set-variable-value! var val env)
    (define (env-loop env)
	(define (scan vars vals)
	    (cond ((null? vars)
		   (env-loop (enclosing-environment env)))
		  ((eq? var (car vars))
		   (set-var! vals var))
		  (else (scan (cdr vars) (cdr cals)))))
	(if (eq! env the-empty-environment)
	    (error "Unbound variable -- SET!" var)
	    (let ((frame (first-frame env)))
		(scan (frame-variable frame)
		      (frame-values frame)))))
    (env-loop env))


(define (definition? exp) (tagged-list exp 'define))

(define (eval-definition exp env)
    (definition-variable! (definition-variable exp)
			  (eval (definition-value exp) env)
			  env)
    'ok)

(define (definition-variable exp)
    (if (symbol? (cadr exp))
	(cadr exp)
	(caadr exp)))

(define (definition-value exp)
    (if (symbol? (cadr exp))
	(caddr exp)
	(make-lambda (caddr exp)
		     (cddr exp))))

(define (if? exp) (tagged-list exp 'if))

(define (if-predicate exp) (cadr exp))

(define (if-consequent exp) (caddr exp))

(define (if-alternative exp) 
    (if (not (null? (cdddr exp)))
	(cadddr exp)
	'false))

(define (eval-if! exp env)
    (if (true! (eval (if-predicate exp) env))
	(eval (if-consequent exp) env)
	(eval (if-alternative exp) env)))

(define (lambda? exp) (tagged-list exp 'lambda))

(define (lambda-parameters exp) (cadr exp))

(define (lambda-body exp) (cddr exp))

(define (make-lambda parameters body)
    (cons 'lambda (cons parameters body)))

(define (make-procedure parameters body)
    (list 'procedure parameters body))

(define (begin? exp) (tagged-list exp 'begin))

(define (begin-actions exp) (cdr exp))

(define (eval-sequence exps env)
    (cond ((list-exp? exps) (eval (first-exp exps) env))
	  (else (eval (first-exp exps) env)
		(eval-sequence (rest-exps exps) env))))

(define (firsr-exp seq) (car seq))

(define (rest-exps seq) (cdr seq))

(define (list-exp? seq) (null? (cdr seq)))

(define (make-begin seq) (cons 'begin seq))

(define (cond? exp) (tagged-list exp 'cond))

(define (sequence->exp seq)
    (cond ((null? seq) seq)
	  ((last-exp? seq) (first-exp seq))
	  (else (make-begin seq))))

(define (cond->if exp)
    (expand-clauses (cond-clauses exp)))

(define (cond-else-clause? clause)
    (eq? (cond-predicate clause) 'else))

(define (cond-predicate clause) (car clause))

(define (cond-actions clause) (cdr clause))

(define (expand-clauses clauses)
    (if (null? clauses)
	'false
	(let ((first (car clauses))
	      (rest (cdr clauses)))
	    (if (cond-else-clause? first)
	    	(if (null? rest)
		    (sequence->exp (cond-actions first))
		    (error "ELSE clauses isn`t last -- COND->IF"
			clauses))
	        (make-if (cond-predicate first)
		         (sequence->exp (cond-actions first))
		         (expand-clauses rest))))))

(define (application? exp (tagged-list exp 'apply)))

(define (opreator exp) (car exp))

(define (operands exp) (cdr exp))

(define (no-operands? ops) (null? ops))

(define (first-operand ops) (car ops))

(define (rest-operands ops) (cdr ops))

(define (list-of-values exps env)
    (if (no-operands? exps)
	'() 
	(cons (eval (first-operand exps) env)
	      (list-of-values (rest-operands exps) env))))

(define (make-frame vars vals)
    (cons vars vals))

(define (extend-environment vars vals base-env)
    (if (= (length vars) (length vals))
	(cons (make-frame vars vals) base-env)
	(if (<  (length vars) (length vals))
	    (error "Too many arguments supplied" vars vals)
	    (error "Too few arguments supplied" vars vals))))

(define (setup-environment)
    (let ((initial-env (extend-environment (primitive-procedure-names)
					   (primitive-procedure-objects)
					   the-empty-environment)))
	(define-variable! 'true true initial-env)
	(define-variable! 'false false initial-env)
	initial-env))

(define primitive-procedures 
    (list (list 'car car)
	  (list 'cdr cdr)
	  (list 'null? null?)
	  (list 'cons cons)))

(define (primitive-procedure-names)
    (map car primitive-procedures))

(define (primitive-procedure-objects)
    (map (lambda (proc) (list 'primitive (cdr proc))) 
	 primitive-procedures))

(define (define-variable! var val env) 
    (let ((frame (first-frame env)))
	(define (scan vars vals)
	    (cond ((null? vars) (add-binding-to-frame! var val frame))
		  ((eq? var (car vars)) (set-car! vals val))
		  (else (scan (cdr vars) (cdr vals)))))
	(scan (frame-variables frame) (frame-values frame))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define input-prompt ";;; M-EVAL input:")
(define output-prompt ";;; M-EVAL value:")

(define (driver-loop)
    (prompt-for-input input-prompt)
    (let ((input (read)))
        (let ((output (eval input the-global-environment)))
	    (announce-output output-prompt)
	    (user-print output)))
    (driver-loop))

(define (prompt-for-input string)
    (newline) (newline) (display string) (newline))

(define (announce-output string)
    (newline) (display string) (newline))

(define (user-print object)
    (if (compound-procedure? object)
	(display (list 'compound-procedure
			(procedure-parameters object)
			(procedure-body object)
			'<procedure-env>))
	(display object)))

(define the-global-environment (setup-environment))

(driver-loop)




    







