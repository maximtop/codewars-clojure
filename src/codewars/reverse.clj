(ns codewars.reverse
  (:refer-clojure :exclude [reverse]))

(defn reverse
  "Reverse a list"
  [lst]
  (reduce conj () lst))

