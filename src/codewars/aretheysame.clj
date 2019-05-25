(ns codewars.aretheysame)


(defn compSame [a b]
  (do
    (println a b)
    (if (or (nil? a) (nil? b))
      false
      (let [a-squared (map #(* % %) a)]
        (= (frequencies a-squared) (frequencies b))))))


(compSame [121, 144, 19, 161, 19, 144, 19, 11]
          [121, 14641, 20736, 361, 25921, 361, 20736, 361])

(some #(= % 121) [121, 14641, 20736, 361, 25921, 361, 20736, 361])


(= (frequencies [1 2 3 3]) (frequencies [1 2 3 3]))


(compSame [2 2 3] [4 9 9])

(compSame [] nil)

(def a nil)
(map * a a)
(some? a)