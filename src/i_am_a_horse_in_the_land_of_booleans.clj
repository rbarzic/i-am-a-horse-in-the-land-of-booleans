(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (= x nil)
    false
    (if (= x false)
      false
      true)))

(defn abs [x]
  (if (<  x 0)
    (- x)
    x))

(defn divides? [divisor n]
  ":(")

(defn fizzbuzz [n]
  ":(")

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  ":(")

(defn generic-doublificate [x]
  ":(")

(defn leap-year? [year]
  ":(")

; '_______'

(teen? 12)
(teen? 13)
(teen? 18)
(teen? 19)
(teen? 20)


(abs -5)
(abs 5)
(abs 0)

