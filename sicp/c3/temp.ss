(define rand
	(let ((x random-init))
		(lambda ()
			(set! x (rand-updata x))
		x)))
