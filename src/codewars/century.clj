(ns codewars.century)


(defn century [year] (int (Math/ceil (/ year 100.0))))

(century 1705)

(century 1900)