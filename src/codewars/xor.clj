(ns codewars.xor
  (:require [clojure.test :refer :all]))

(defn xor [a,b]
  (and (or a b) (not (and a b))))

(deftest Tests
  (is (= (xor false false) false) "false xor false === false")
  (is (= (xor true false) true) "true xor false === true")
  (is (= (xor false true) true) "false xor true === true")
  (is (= (xor true true) false) "true xor true === false")
  (is (not= (xor true true) true) "'xor' is NOT identical to 'or'"))