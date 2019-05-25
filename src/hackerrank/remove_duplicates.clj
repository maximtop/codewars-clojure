(ns hackerrank.remove-duplicates)

(require '[clojure.string :as string])

(defn remove-duplicates [strg]
  (string/join "" (distinct strg)))

(remove-duplicates "maxim")