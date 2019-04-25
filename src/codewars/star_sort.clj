(ns codewars.star-sort)
(require '[clojure.string :as str])

(defn star-sort [arr]
  (->> (sort arr)
       (first)
       (str/join "***")))

(star-sort ["bitcoin" "take" "over" "the" "world" "maybe" "who" "knows" "perhaps"])