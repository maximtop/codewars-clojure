(ns codewars.array-diff-test
  (:require [clojure.test :refer :all]
            [codewars.array-diff :refer :all]))

(defn test-array-diff [act exp]
  (is (= act exp)))

(deftest a-test
  (testing "jaden-case"
    (test-array-diff (array-diff [1 2 3] [2 3]) [1])
    (test-array-diff (array-diff [] []) [])
    (test-array-diff (array-diff [1 2 3] [1 2 3]) [])))
