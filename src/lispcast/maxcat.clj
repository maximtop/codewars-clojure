(ns lispcast.maxcat
  (:require [clojure.string :as string]))

(defn maxcat [nums]
  (if (= 0 (count nums))
    []
    (->> nums
         (map str)
         sort
         reverse
         (string/join "")
         (Integer.))))


; Largest integer from concatenation
;
; If I have a list of integers, I can concatenate their base-10 strings to get one large integer. However, if I reorder them, then concatenate them, I could get a larger integer. The task here is to find the largest integer you can create by concatenating a given set of integers.
;
; Here are some test cases:

(maxcat [1 2 3 4 5 6 7 8 9]) ;=> 987654321
(maxcat [12 34 56 199])      ;=> 563419912
(maxcat [])