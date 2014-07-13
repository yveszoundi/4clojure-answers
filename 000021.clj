;; 4Clojure Question 21
;;
;; Write a function which returns the Nth element from a sequence.
;;
;; Restrictions (please don't use these function(s)): nth
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= (__ '(4 5 6 7) 2) 6)

;; (= (__ [:a :b :c] 0) :a)

;; (= (__ [1 2 3 4] 1) 2)

;; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])
(= (.get '(4 5 6 7) 2) 6)
