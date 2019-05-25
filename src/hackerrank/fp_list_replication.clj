(ns hackerrank.fp-list-replication)

(defn replicate-list [num lst]
  (flatten (map #(repeat num %) lst)))

(replicate-list 2 [1 2 3])
