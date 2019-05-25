(ns codewars.which-are-in
  (:require [clojure.string :as string]))

(defn in-array [array1 array2]
  ; your code
  (->> array1
       (filter (fn [substring] (some #(string/includes? % substring) array2)))
       sort
       distinct))

(def word "test")
(some #(string/includes? % word) ["te" "tes"])

(def ur ["olp" "love" "string"])
(def vr ["ulove" "alove" "holp" "sholp","vfmstring"])
(in-array ur vr)

(in-array ["duplicates" "duplicates"] ["duplicates" "duplicates"])