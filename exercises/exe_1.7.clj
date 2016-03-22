(defn average
  [x y]
  (/ (+ x y) 2))

(defn improve
  [guess x]
  (average guess (/ x guess)))

(defn square
  [x]
  (* x x))

(defn good-enough?
  [guess x]
  (< (Math/abs (- (square guess)
                  x))
    0.001))

(defn sqrt-iter
  [x]
  (loop [guess 1.0]
    (if (good-enough? guess)
      guess
      (recur (improve guess x)))))

(defn better-good-enough?
  [prevguess guess]
    (< (Math/abs (- guess
                    prevguess))
    0.000001))

(defn better-sqrt-iter
  [x]
  (loop [prevguess 0 guess 1.0]
    (if (better-good-enough? prevguess guess)
      guess
      (recur guess (improve guess x)))))
