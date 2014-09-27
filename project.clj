(defproject clojometer "0.1.0-SNAPSHOT"
  :description "A simple clojure app to parse the pedometer data from iPod nano 6th gen"
  :url "http://example.com/FIXME"
  :license {:name "Apache Licence 2.0"}
  :dependencies [[org.clojure/clojure "1.6.0"]
		[org.clojure/data.xml "0.0.8"]]
  :main ^:skip-aot clojometer.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
