(ns origami-simple.core-test
  (:require
    [opencv3.core :refer :all]
    [opencv3.colors.rgb :as rgb]
    [opencv3.utils :as u]
    [clojure.test :refer :all]
    [origami-simple.core :refer :all]))

(deftest a-test
  (testing "simple opencv test."
   (let [mat (new-mat 3 3 CV_8UC1 (new-scalar 150 150 150))]) ))
