(ns codewars.digitize)

(defn digitize [n]
  (->> (str n)
       (reverse)
       (map #(Integer/parseInt (str %)))))

(digitize 35231)