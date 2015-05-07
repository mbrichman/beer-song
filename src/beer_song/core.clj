(ns beer-song.core)

(defn check-suffix [n]
  (cond
    (> n 2) (str (- n 1) " bottles of beer on the wall.\n")
    (= n 2) (str (- n 1) " bottle of beer on the wall.\n")
    (= n 1) (str "no more bottles of beer on the wall.\n")))

(defn check-prefix [n]
  (cond
    (> n 1) (str n " bottles")
    (= n 1) "1 bottle"))

(defn verse
  [x]
    (str
      (check-prefix x) " of beer on the wall, "
      (check-prefix x) " of beer.\nTake "
      (if (= x 1) "it" "one")
      " down and pass it around, "
      (check-suffix x)))


(defn sing
  [x & y]
  (str x (first y) "Hello, World!"))
