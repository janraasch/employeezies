(ns reporting-example.routes.home
  (:require [reporting-example.layout :as layout]
            [reporting-example.reports :as reports]
            [compojure.core :refer [defroutes GET]]
            [ring.util.response :as response]
            [clojure.java.io :as io]))

(defn write-response [report-bytes]
  (with-open [in (java.io.ByteArrayInputStream. report-bytes)]
    (-> (response/response in)
        (response/header "Content-Disposition" "file-name=document.pdf")
        (response/header "Content-Length" (count report-bytes))
        (response/content-type "application/pdf"))))

(defn generate-report [report-type]
  (try
    (let [out (java.io.ByteArrayOutputStream.)]
      (condp = (keyword report-type)
        :table (reports/table-report out)
        :list  (reports/list-report out))
      (write-response (.toByteArray out)))
    
    (catch Exception ex
      (layout/render "home.html" {:error (.getMessage ex)}))))

(defn home-page []
  (layout/render "home.html"))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page))
  (GET "/:report-type" [report-type] (generate-report report-type)))

