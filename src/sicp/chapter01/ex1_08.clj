(ns sicp.chapter01.ex1-08)

(defn average
  [x y]
  (/ (+ x y) 2))

(defn square
  [x]
  (* x x))

(defn improve
  [y x]
    (/ (+ (/ x (square y))
        (* 2 y))
    3))

(defn good-enough?
  [prevguess guess]
    (< (Math/abs (- guess
                    prevguess))
    0.000001))

(defn cube
  [x]
  (loop [prevguess 0 guess 1.0]
    (if (good-enough? prevguess guess)
      guess
      (recur guess (improve guess x)))))
