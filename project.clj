(defproject origami-simple "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
  :url "http://example.com/FIXME"
  :main simple.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [   
  [origami "4.0.0-beta6" :exclusions [opencv/opencv-native]]
  [opencv/opencv-native-ubuntu16-noffmpeg "4.0.0-beta"]
  [org.clojure/clojure "1.8.0"]])