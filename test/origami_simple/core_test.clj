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

(deftest b-test
   (testing "jpg, png and canny test."
	(->
	 (imread "cat_in_bowl.jpeg")
	 (cvt-color! COLOR_RGB2GRAY)
	 (canny! 300.0 100.0 3 true)
	 (bitwise-not!)
	 (u/resize-by 0.5)
	 (imwrite "canny-cat.jpg"))))