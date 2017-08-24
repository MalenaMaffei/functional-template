(ns exercise3)

(defn fibonacci
  "Returns fibonacci number."
  [x]
  (nth 
    (take (+ x 1) 
      (map first (iterate (fn [[a b]] [b (+ a b)]) [0 1]))
    ) x
  )
)
