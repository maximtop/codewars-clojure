(ns codewars.jaden-case
  (:require [clojure.string :as str]))

(defn jaden-case [s]
  (->> (str/split s #" ")
       (map str/capitalize)
       (str/join " ")))

(jaden-case "maxim maxim")