;; 4Clojure Question 10
;;
;; Maps store key-value pairs.  Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= __ ((hash-map :a 10, :b 20, :c 30) :b))

;;(= __ (:b {:a 10, :b 20, :c 30}))

(= 20 ((hash-map :a 10, :b 20, :c 30) :b))
