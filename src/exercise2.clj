(ns exercise2)

(defn greater-than-five?
  "checks if number is greater than five."
  [x]
  (> x 5)
)

(defn only-greater-than-five
  "filters out numbers lesser than five."
  [x]
(filter greater-than-five? x))




