(ns codewars.light-sabers-test
  (:require [clojure.test :refer :all]
            [codewars.light-sabers :refer :all]))

(defn testHowManyLightSabersDoYouOwn [act exp]
  (is (= act exp)))

(deftest a-test1
  (testing "light-sabers"
    (testHowManyLightSabersDoYouOwn (howManyLightSabersDoYouOwn "Zach") 18)
    (testHowManyLightSabersDoYouOwn (howManyLightSabersDoYouOwn "Maxim") 0)
    (testHowManyLightSabersDoYouOwn (howManyLightSabersDoYouOwn "") 0)))