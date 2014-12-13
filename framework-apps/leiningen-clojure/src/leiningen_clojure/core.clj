(ns leiningen-clojure.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (require '[clojure.string :as str])
  (def morse-data {:a ".-" :b "-..." :c "-.-." :d "-.." :e  "." :f "..-."
    :g "--." :h "...." :i ".." :j ".---" :k "-.-" :l ".-.." :m "--" :n "-."
    :o "---" :p ".--." :q "--.-" :r ".-." :s "..." :t "-" :u "..-" :v "...-"
    :w ".--" :x "-..-" :y "-.--" :z "--.."})
  (into {}
    (for [[k v] morse-data]
      (println [(keyword k) v])))
  (defn teste [str]
    (for [[k v] str]
      (println str)))
  (defn char-counter [str]
    (loop [s str]
      s))
  (def value (read-line))
  (def map-value (map char value))
  (println "morse converted:")
  (println value)
  (teste map-value))
