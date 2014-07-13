;; 4Clojure Question 14
;;
;; Clojure has many different ways to create functions.
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= __ ((fn add-five [x] (+ x 5)) 3))

;; (= __ ((fn [x] (+ x 5)) 3))

;; (= __ (#(+ % 5) 3))

;; (= __ ((partial + 5) 3))

(= 8 ((fn add-five [x] (+ x 5)) 3))
