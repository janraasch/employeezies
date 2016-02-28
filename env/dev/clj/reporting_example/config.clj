(ns reporting-example.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [reporting-example.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[reporting-example started successfully using the development profile]=-"))
   :middleware wrap-dev})
