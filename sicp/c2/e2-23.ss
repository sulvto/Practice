(define (for-each proc items)
	(define (tem i a)
		(if(null?(cdr i))
			(proc (car i))
			(tem (cdr i) (proc (car i)))))
	(tem items 0)))

(for-each (lambda (x)(newline)(display x)) (list 22 32 46 6 87))
