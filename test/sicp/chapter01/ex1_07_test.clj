(ns sicp.chapter01.ex1-07-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.ex1-07 :refer :all]))

; Book examples
(deftest test-sqrt
  (is 3.00009155413138 (sqrt 9))
  (is 11.704699917758145 (sqrt (+ 100 37)))
  (is 1.7739279023207892 (sqrt (+ (sqrt 2) (sqrt 3))))
  (is 1000.000369924366 (square (sqrt 1000))))

; Test solution
(deftest test-better-sqrt
  (is 3.0 (better-sqrt 9))
  (is 0.02 (better-sqrt 0.0004))
  (is 1000.0 (square (better-sqrt 1000))))
