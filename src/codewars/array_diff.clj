(ns codewars.array-diff
  (:require [clojure.set :refer :all]))

(defn has [val coll]
  (some (partial = val) coll))

;my solution
(defn array-diff-mine [a b]
  (vec (filter (fn [val] (not (has val b))) a)))

;idiomatic
(defn array-diff [a b]
  (remove (set b) a))


(array-diff [1 2 3] [1])

