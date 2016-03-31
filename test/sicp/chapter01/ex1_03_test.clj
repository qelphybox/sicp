(ns sicp.chapter01.ex1-03-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.ex1-03 :refer :all]))

(deftest test-asserts
  (is 13 (solution 1 2 3))
  (is 13 (solution 1 3 2))
  (is 29 (solution 5 2 1))
  (is 13 (solution -2 -3 -5)))
