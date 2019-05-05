(ns codewars.longest
  (:require [clojure.string :as string]))

(defn longest [s1 s2]
  (string/join (sort (set (str s1 s2)))))

(longest "aretheyhere" "yestheyarehere")
