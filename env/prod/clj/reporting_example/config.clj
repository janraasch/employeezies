(ns reporting-example.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[reporting-example started successfully]=-"))
   :middleware identity})
