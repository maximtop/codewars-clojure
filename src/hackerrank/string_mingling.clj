(ns hackerrank.string-mingling
  (:require [clojure.string :as string]))

;(def first-str (read-line))
;(def second-str (read-line))

(defn string-mingling [first second]
  (string/join #"" (map str first second)))

(string-mingling "maxim" "stasy")