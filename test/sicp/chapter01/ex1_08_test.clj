(ns sicp.chapter01.ex1-08-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.ex1-08 :refer :all]))

(deftest test-cube
  (is 2.0 (cube 8))
  (is 3.0 (cube 27))
  (is 4.0 (cube 64))
  (is 5.0 (cube 125))
  (is 6.0 (cube 216))
  (is 7.0 (cube 343))
  (is 8.0 (cube 512))
  (is 9.0 (cube 729)))
