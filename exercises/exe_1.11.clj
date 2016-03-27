(defn f-recursive
  [n]
  (if (< n 3) n
      (+  (f-recursive (- n 1))
          (f-recursive (- n 2))
          (f-recursive (- n 3)))))

(defn f-iterative
  [n]
  (loop [a 2 b 1 c 0 n n]
    (if (zero? n) c
                  (recur (+ a b c)
                    a
                    b
                    (dec n)))))
