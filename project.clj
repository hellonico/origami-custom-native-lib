(defproject origami-simple "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :repositories [["vendredi" "https://repository.hellonico.info/repository/hellonico/"]]
  :url "http://example.com/FIXME"  
  :jvm-opts ["-Djava.library.path=natives"]
  :main simple.core
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aliases {"nativetest" ["test" ":only" "origami-simple.native-test" ]}
  :dependencies [   
  [origami "4.7.0-5" :exclusions [opencv/opencv-native]]
  [org.clojure/clojure "1.11.1"]])