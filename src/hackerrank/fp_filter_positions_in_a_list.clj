(ns hackerrank.fp-filter-positions-in-a-list)

(defn fp-filter-positions-in-a-list [lst]
  (map (fn [[n]] n) (filter #(= (mod (% 1) 2) 1) (map vector lst (range (count lst))))))


(defn fp-filter-positions-in-a-list [lst]
  (->> (map vector lst (range (count lst)))
       (filter #(= (mod (% 1) 2) 1))
       (map (fn [[n]] n))))


(fp-filter-positions-in-a-list [2 3 4 5])