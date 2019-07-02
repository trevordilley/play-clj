(ns test
  (:require [clojure.test :refer :all]))

(deftest without-name
  (is (= "Hello, World!" "Hello, World!")))

