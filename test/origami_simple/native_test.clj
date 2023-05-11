(ns origami-simple.native-test
 (:require [clojure.test :refer :all])
 (:import [org.scijava.nativelib NativeLibraryUtil]))

(deftest testme
     (println (NativeLibraryUtil/getPlatformLibraryPath "natives")))