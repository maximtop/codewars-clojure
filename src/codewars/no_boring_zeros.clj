(ns codewars.no-boring-zeros)

(defn remove-lead-zeros [coll]
  (let [[first & rest] coll]
    (if (= 0 first)
      (remove-lead-zeros rest)
      (cons first rest))))

(defn remove-last-zeros [coll]
  (->> (reverse coll)
       (remove-lead-zeros)
       (reverse)))

(defn no-boring-zeros-positive [n]
  (->>
    (str n)
    (map #(Integer/parseInt (str %)))
    (remove-last-zeros)
    (clojure.string/join)
    (#(Integer/parseInt (str %)))))


(defn no-boring-zeros-var1 [n]
  (if (zero? n)
    n
    (if (neg? n)
      (- 0 (no-boring-zeros-positive (- n)))
      (no-boring-zeros-positive n))))

(defn no-boring-zeros [n]
  (cond (zero? n) n
        (zero? (rem n 10)) (recur (/ n 10))
        :else n))


(no-boring-zeros 1450)
(no-boring-zeros 0)
(no-boring-zeros 1050)
(no-boring-zeros -960000)