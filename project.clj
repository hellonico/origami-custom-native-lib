(defproject origami-simple "0.1.0-SNAPSHOT"
  :injections [
   (clojure.lang.RT/loadLibrary org.opencv.core.Core/NATIVE_LIBRARY_NAME)
  ]
  :description "FIXME: write description"
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [   [opencv/opencv-native "3.3.1_2"] [origami "0.1.10"][org.clojure/clojure "1.8.0"]])
