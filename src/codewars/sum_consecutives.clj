(ns codewars.sum-consecutives)

(defn sum-consecutives [coll]
  (map (partial apply +)
    (partition-by identity coll)))

(sum-consecutives [1 1 1 2 2 3 3])