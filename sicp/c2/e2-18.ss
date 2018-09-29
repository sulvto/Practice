(define (reverse items) 
    (define (next i a)
	(if(null?(cdr i))
	    (cons (car i) a)
	    (next (cdr i)(cons (car i) a))))
    (next items (list)))

(reverse (list 1 2 3 4))
(reverse (list 34 56 78 90 34 68 90))
