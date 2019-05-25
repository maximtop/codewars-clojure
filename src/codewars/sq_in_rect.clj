(ns codewars.sq-in-rect)

(defn sq-in-rect
  "https://www.codewars.com/kata/rectangle-into-squares/train/clojure"
  [lng wdth]
  ((fn itr [l w]
     (cond (= l w) [[l l]]
           (> l w) (cons [l l] (itr (- l w) w))
           :else (cons [w w] (itr l (- w l))))) lng wdth))

(sq-in-rect 2 1)

