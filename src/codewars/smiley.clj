(ns codewars.smiley)
(defn count-smileys [arr]
  ;return the total number of smiling faces in the array
  (let [regex #"^[;:][~-]?[D)]$"]
    (count (filter #(re-matches regex %) arr))))


(defn test-regex [smiles regex]
  (filter #(re-matches regex %) smiles))

(def regex #"^(;|:)(~|-)?(D|\))$")

(test-regex ";-)" regex)
(test-regex ";-)" regex)

(test-regex [":)"  ";("  ";}"  ":-D"] regex)
(test-regex [";]"  ":["  ";*"  ":$"  ";-D"] regex)
(test-regex [":)" ":(" ":D" ":O" ":;"] regex)
(count-smileys [":-)" ";~D" ":-D" ":_D"])

(filter (fn [smile] (re-matches regex smile)) [":)"  ";("  ";}"  ":-D"])
