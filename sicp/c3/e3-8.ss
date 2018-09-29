(define a -1)
(define (f v) 
	(if (= a -1)
	    (begin (set! a 1) v)
	    0))

;;(+ (f 0)(f 1))

(+ (f 1)(f 0))
