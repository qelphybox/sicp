(ns sicp.chapter01.ex1-11-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.ex1-11 :refer :all]))

(deftest test-f-recursive
  (is 1 (f-recursive 1))
  (is 2 (f-recursive 2))
  (is 3 (f-recursive 3))
  (is 6 (f-recursive 4))
  (is 101902 (f-recursive 20)))

(deftest test-f-iterative
  (is 1 (f-iterative 1))
  (is 2 (f-iterative 2))
  (is 3 (f-iterative 3))
  (is 6 (f-iterative 4))
  (is 101902 (f-iterative 20)))
