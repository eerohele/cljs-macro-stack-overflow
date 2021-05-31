(ns hello-world.core
  (:require-macros [hello-world.macros]))

(defn -main
  [& _]
  (hello-world.macros/frobnicate))
