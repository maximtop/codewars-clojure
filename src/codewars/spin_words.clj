(ns clojure.spin-words
  (:require [clojure.string :as str]))

(defn reverse-word [word]
  (if (>= (count word) 5)
    (str/join (reverse word))
    word))

(defn spin-words [strng]
  (->> (str/split strng #" ")
       (map reverse-word)
       (str/join  #" ")))

(spin-words "Stop spinning my words")