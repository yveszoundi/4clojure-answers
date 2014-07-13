;; 4Clojure Question 20
;;
;; Write a function which returns the second to last element from a sequence.
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= (__ (list 1 2 3 4 5)) 4)

;; (= (__ ["a" "b" "c"]) "b")

;; (= (__ [[1 2] [3 4]]) [1 2])
(= ((comp last butlast) (list 1 2 3 4 5)) 4)
