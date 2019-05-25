(ns hackerrank.fp-update-list)

(defn update-list [lst]
  (map #(Math/abs %) lst))

(update-list [1 -1 -2 -3 4])