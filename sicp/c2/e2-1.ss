(define (add-rat x y)
  (make-rat (+ (* (number x) (denom y))
	       (* (number y) (denom x)))
	    (* (denom x) (denom y))))

(define (sub-rat x y)
  (make-rat (- (* (number x) (number y))
	       (* (number y) (number x)))
	    (* (denom x) (denom y))))

(define (mul-rat x y)
  (make-rat (* (number x)(number y))
	    (* (denom x)(denom y))))

(define (div-rat x y)
  (make-rat (* (number x)(denom y))
	    (* (denom x)(number y))))

(define (make-rat n d)	
	(cond ((and (< n 0)(< d 0)) (cons (* -1 n) (* -1 d)))
		((< n 0) (cons n d))
		((< d 0) (cons (* -1 n)(* -1 d)))
		(else (cons n d))))

(define (number x)(car x))
(define (denom x)(cdr x))

(define (print-rat x)
	(newline)
	(display (number x))
	(display "/")
	(display (denom x)))



(define one-half (make-rat 1 2))
(define one-third (make-rat 1 3))

(print-rat one-half)
(print-rat (add-rat one-half one-third))
;;5/6

(define one-half (make-rat -1 -2))
(define one-third (make-rat 1 3))

(print-rat one-half)
(print-rat (add-rat one-half one-third))
;;5/6

(define one-half (make-rat -1 2))
(define one-third (make-rat 1 3))

(print-rat one-half)
(print-rat (add-rat one-half one-third))
;;-1/6

(define one-half (make-rat -1 2))
(define one-third (make-rat 1 -3))

(print-rat one-half)
(print-rat (add-rat one-half one-third))
;;-5/6
