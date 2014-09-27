(ns clojometer.core
  (:gen-class)
  (:require [clojure.data.xml :as xml]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def ped-xml 
	  (->(clojure.java.io/reader "ped-example.xml")
  		(xml/parse)))
		(println (for [x (xml-seq ped-xml)
			:when (= :distanceString (:tag x))]
		    (first (:content x)))))
