;; 4Clojure Question 8
;;
;; Sets are collections of unique values.
;;
;; Use M-x 4clojure-check-answers when you're done!

;;(= __ (set '(:a :a :b :c :c :c :c :d :d)))

;;(= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
