(define (double f)(lambda (x)(f (f x))))
(define (inc i) (+ 1 i))

((double inc) 1)
(((double (double double)) inc) 5)

