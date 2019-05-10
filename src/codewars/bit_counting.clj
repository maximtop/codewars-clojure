(ns codewars.bit-counting)

(defn count-bits [n]
  ; Write your code here
  (count (filter #(= (str %) "1") (Integer/toString n 2))))

(count (filter #(= (str %) "1") (Integer/toString 2 2)))