(define (new-if predicate then-clause else-clause)
	 (cond (predicate then-clause)
		(else else-clause)))  

(new-if (= 0 2) 0 9)
