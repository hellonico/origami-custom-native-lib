(defproject origami-simple "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
  :url "http://example.com/FIXME"
  :main simple.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [   
  [origami "4.0.0-beta7"]
  [opencv/opencv-native-libc_2_19 "4.0.0-beta"]
  [org.clojure/clojure "1.9.0"]])