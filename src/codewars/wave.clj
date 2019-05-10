(ns codewars.wave
  (:require [clojure.string :as string]))

(defn string->char-indexes [strg]
  (vec (into (sorted-map-by <) (filter
                                 (fn [[_ value]] (not (string/blank? (string/trim (str value)))))
                                 (zipmap (->> (count strg)
                                              (range))
                                         strg)))))

(defn replace-by-pos [strg char pos]
  (string/join "" (assoc (string/split strg #"") pos char)))

(defn wave [strg]
  (if (string/blank? strg)
    []
    (let [char-indexes (string->char-indexes strg)
          cnt (count char-indexes)
          repeated (repeat cnt strg)]
        (map-indexed (fn [idx itm]
                       (let [[char-idx char-replacement] (char-indexes idx)]
                         (replace-by-pos itm (string/upper-case char-replacement) char-idx)))
                     (vec repeated)))))

(wave " abc ")


;; other solution

(defn upper-index [string index]
  (str
    (subs string 0 index)
    (clojure.string/upper-case (subs string index (inc index)))
    (subs string (inc index))))


(defn wave2 [string]
  (map #(upper-index string %1)
       (filter #(Character/isLetter (nth string %1)) (range (count string)))))

(wave2 " abc d ")

(range (count "test"))

(map #(str % "bla") (filter #(Character/isLetter (nth "te st" %1)) (range (count "te st"))))



(map (fn [_](identity "bla")) (range 5)) ; works
; (map #(str "bla") (range 5)) ; Wrong number of args (1) passed to: /eval7729/fn--7730
; map fn must take 1 or more arguments

(#(identity "bla")) ; works
((fn [] (identity "bla"))) ; works

