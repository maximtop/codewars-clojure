(ns codewars.descending-order
  (:require [clojure.string :as string]))

(defn desc-order [n]
  (->> (str n)
       sort reverse
       (apply str)
       Integer/parseInt))

(desc-order 4231)
