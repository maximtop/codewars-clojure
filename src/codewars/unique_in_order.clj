(ns codewars.unique-in-order)

(defn unique-in-order [input]
  (map first (partition-by identity input)))

(unique-in-order [1 2 3 3])
(unique-in-order "AAAABBBCCDAABBB")