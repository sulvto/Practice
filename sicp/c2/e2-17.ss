(define (last-pair items)
	(define (next sq prev)
		(if (null? sq)
		    prev
		    (next (cdr sq) (car sq))))
	(next items -1)) ;; -1 nil

(define sqares (list 1 2 3 4))
(last-pair (list 23 4 66 3 1 7 8))
