;; 4Clojure Question 19
;;
;; Write a function which returns the last element in a sequence.
;;
;; Restrictions (please don't use these function(s)): last
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= (__ [1 2 3 4 5]) 5)

;; (= (__ '(5 4 3)) 3)

;; (= (__ ["b" "c" "d"]) "d")
(= ((comp first reverse) [1 2 3 4 5]) 5)
