(ns codewars.two-fighters)

(defrecord Fighter [name hp attack])

(def f1 (->Fighter "harold" 10 3))
(def f2 (->Fighter "ivan" 8 4))

(defprotocol Fighters
  (data [data] "implementation to return data"))

(extend-type Fighter
  Fighters
  (data [this] ((juxt :name :hp :attack) this)))

(data f1) ; => ["harold" 10 3]

(defn declare-winner [f1 f2]
  (let [f2-attack (:attack f2)
        f1-hp (:hp f1)]
    (if (>= f2-attack f1-hp)
      (:name f2)
      (recur f2 (assoc f1 :hp (- f1-hp f2-attack))))))

(declare-winner f1 f2)