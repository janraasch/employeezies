(ns reporting-example.test.db.core
  (:require [reporting-example.db.core :as db]
            [reporting-example.db.migrations :as migrations]
            [clojure.test :refer :all]
            [clojure.java.jdbc :as jdbc]
            [conman.core :refer [with-transaction]]
            [config.core :refer [env]]
            [mount.core :as mount]))

(use-fixtures
  :once
  (fn [f]
    (mount/start #'reporting-example.db.core/*db*)
    (migrations/migrate ["migrate"])
    (f)))

(deftest test-users
  (with-transaction [t-conn db/*db*]
    (jdbc/db-set-rollback-only! t-conn)
    (is (empty? (db/read-employees)))))
