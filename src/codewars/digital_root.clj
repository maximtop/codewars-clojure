(ns codewars.digital-root
  (:require [clojure.string :as string]))

(defn digital-root [n]
  (if (< n 10)
    n
    (recur (->> (string/split (str n) #"")
                (map #(Integer. %))
                (apply +)))))

(digital-root 12345)

