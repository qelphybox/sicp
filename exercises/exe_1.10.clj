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

(defn foo1 [n] (A 0 n)) ; 2*n
(defn foo2 [n] (A 1 n)) ; 2^n
(defn foo3 [n] (A 2 n)) ; n=1 == 2^1 ; n > 1 == 2^h(n-1)
