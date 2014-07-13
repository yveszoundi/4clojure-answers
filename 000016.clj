;; 4Clojure Question 16
;;
;; Write a function which returns a personalized greeting.
;;
;; Use M-x 4clojure-check-answers when you're done!

;; (= (__ "Dave") "Hello, Dave!")

;; (= (__ "Jenn") "Hello, Jenn!")

;; (= (__ "Rhea") "Hello, Rhea!")
(= (format "Hello, %s!" "Dave") "Hello, Dave!")
