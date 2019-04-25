(ns codewars.even-or-odd)

(defn even-or-odd [number]
  (if (even? number)
    "Even"
    "Odd"))

(even-or-odd 2)
(even-or-odd 0)
(even-or-odd 7)