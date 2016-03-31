(ns sicp.chapter01.ex1-02-test
  (:require [clojure.test :refer :all]
            [sicp.chapter01.ex1-02 :refer :all]))

(deftest test-asserts
  (is -37/150 solution))
