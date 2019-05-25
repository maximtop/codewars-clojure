(ns hackerrank.string-compression)

(require '[clojure.string :as string])

(defn string-compression [strg]
  (string/join #"" (map #(str (first %) (if (> (count %) 1)
                                          (count %))) (partition-by identity strg))))

(string-compression "maaaxxxxiiiiiimaa")