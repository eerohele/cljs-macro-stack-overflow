(ns hello-world.macros
  (:require
   [cljs.core.async :as async]))

(defmacro frobnicate
  []
  `(async/go
     (doseq [a# (range 1)]
       (doseq [b# (range 2)]
         (doseq [c# (range 3)]
           (doseq [d# (range 4)]
             (doseq [e# (range 5)]
               (doseq [f# (range 6)]
                 (println "hello" a# b# c# d# e# f# g# h#)))))))))
