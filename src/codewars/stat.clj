(ns codewars.stat
  (:require [clojure.string :as string]))

(defn h->s [h] (* h 3600))

(defn m->s [m] (* m 60))

(defn s->h [s] (Math/floor (/ s 3600.0)))

(defn s->m [s] (Math/floor (/ s 60.0)))

(defn result->sec [str]
  (let [[h m s] (map #(Integer/parseInt %) (string/split str #"\|"))]
    (+ (h->s h) (m->s m) s)))

(defn get-range [coll]
  (- (apply max coll) (apply min coll)))

(defn get-average [coll]
  (int (/ (apply + coll) (count coll))))

(defn get-median [coll]
  (let [sorted (sort coll)
        cnt (count coll)
        middle (quot cnt 2)]
    (do
      (if (odd? cnt)
        (nth sorted middle)
        (int (/ (+ (nth sorted (dec middle)) (nth sorted middle)) 2))))))


(defn sec->result [s]
  (let [h (s->h s)
        m (s->m (- s (+ (h->s h))))
        s (- s (+ (h->s h) (m->s m)))]
    (string/join "|" (->> [h m s]
                          (map int)
                          (map (partial format "%02d"))))))

(defn stat [strg]
  (if (= "" strg)
    ""
    (let [results (map (comp result->sec string/trim) (string/split strg #","))]
      (do
        (str
          "Range: " (sec->result (get-range results)) " "
          "Average: " (sec->result (get-average results)) " "
          "Median: " (sec->result (get-median results)))))))


(stat "01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17")
(stat "02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41")

(stat "")