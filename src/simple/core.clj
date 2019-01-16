
(ns simple.core
 (:require 
 	[opencv4.utils :as u] 
 	[opencv4.core :refer [imread imwrite IMREAD_REDUCED_GRAYSCALE_4 VERSION]]))

(defn -main [& args]
  (println "Using OpenCV Version: " VERSION "..")
  (-> "cat_in_bowl.jpeg"
    (imread IMREAD_REDUCED_GRAYSCALE_4)
    (imwrite "cat_bw.jpeg")))