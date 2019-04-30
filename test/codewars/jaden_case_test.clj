(ns codewars.jaden-case-test
  (:require [clojure.test :refer :all]
            [codewars.jaden-case :refer :all]))

(defn test-jaden-case [act exp]
    (is (= act exp)))

(deftest a-test
  (testing "jaden-case"
    (test-jaden-case (jaden-case "Hello world") "Hello World")
    (test-jaden-case (jaden-case "") "")
    (test-jaden-case (jaden-case "maxim") "Maxim")))
