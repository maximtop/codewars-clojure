(ns codewars.bouncing-balls)

(defn bouncing-balls
  "function description: https://www.codewars.com/kata/bouncing-balls/train/clojure"
  [h bounce window]
  (cond
    (or (<= h 0) (<= h window) (<= bounce 0) (>= bounce 1)) -1
    :else (let [bounces ((fn bounce-seq [a]
                           (cond (< a window) nil
                                 :else (cons a (bounce-seq (* a bounce)))))
                         h)]
            (- (* (count bounces) 2) 1))))

(bouncing-balls 3 0.66 1.5)

(bouncing-balls 30 0.66 1.5)
