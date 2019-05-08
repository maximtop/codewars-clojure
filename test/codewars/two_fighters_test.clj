(ns codewars.two-fighters-test
  (:require [clojure.test :refer :all]
            [codewars.two-fighters :refer [declare-winner ->Fighter]]))

(defn test-two-fighters [act exp]
  (is (= act exp)))

(deftest declare-winner-test
  (testing "declare-winner"
    (let [f1 (->Fighter "harold" 10 2)
          f2 (->Fighter "ivan" 10 2)]
      (test-two-fighters (declare-winner f1 f2) "ivan")
      (test-two-fighters (declare-winner f2 f1) "harold"))))

