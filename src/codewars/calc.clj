(ns codewars.calc
  (:require [clojure.string :as string]))

(defn str-to-ascii [target]
  (map #(Integer/parseInt (str %)) (string/join (map (comp str int) target))))

(defn calc [s]
  (let [init (str-to-ascii s)
        replaced (replace {7 1} init)]
    (- (reduce + init) (reduce + replaced))))

(calc "ABC") ; 6
(calc "abcdef") ; 6