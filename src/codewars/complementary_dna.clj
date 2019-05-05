(ns codewars.complementary-dna)

(defn dna-strand [dna]
  (clojure.string/replace dna #"A|T|C|G" {"A" "T" "T" "A" "C" "G" "G" "C"}))

(dna-strand "ATCG") ;"TAGC"

