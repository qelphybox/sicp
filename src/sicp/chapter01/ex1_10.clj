(ns sicp.chapter01.ex1-10)

(defn A
  [x y]
  (cond (zero? y) 0
        (zero? x) (* 2 y)
        (= y 1) 2
        :else (A (dec x)
                  (A x (dec y)))))

(A 1 10)  ;1024
(A 2 4)   ;65536
(A 3 3)   ;65536

(defn f [n] (A 0 n)) ; 2*n
(defn g [n] (A 1 n)) ; 2^n
(defn h [n] (A 2 n)) ; n=1 == 2^1 ; n > 1 == 2^h(n-1)
