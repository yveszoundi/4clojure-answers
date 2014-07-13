;; 4Clojure Question 22
;;
;; Write a function which returns the total number of elements in a sequence.
;;
;; Restrictions (please don't use these function(s)): count
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= (__ "Hello World") 11)

;; (= (__ [[1 2] [3 4] [5 6]]) 3)

;; (= (__ '(13)) 1)

;; (= (__ '(:a :b :c)) 3)
(= ( (comp #(reduce + %) #(map (fn[x] 1) %))  '(1 2 3 3 1)) 5)
