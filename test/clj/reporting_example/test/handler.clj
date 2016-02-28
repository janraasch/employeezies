(ns reporting-example.test.handler
  (:require [clojure.test :refer :all]
            [ring.mock.request :refer :all]
            [reporting-example.handler :refer :all]))

(deftest test-app
  (testing "main route"
    (let [response (app (request :get "/"))]
      (is (= 200 (:status response)))))

  (testing "some pdf name route"
    (let [response (app (request :get "/pdftype"))]
      (is (= 200 (:status response))))))
