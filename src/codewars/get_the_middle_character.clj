(ns codewars.get-the-middle-character)

(defn get-middle [s]
  (if (< (count s) 3)
    s
    (get-middle (subs s 1 (dec (count s))))))

(get-middle "maxim")
(get-middle "m")
(get-middle "ma")
(get-middle "max")
