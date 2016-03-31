(defproject sicp "0.1.0-SNAPSHOT"
  :description "Small project for SICP solvings"
  :url "https://github.com/qelphybox/sicp.git"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                [org.clojure/test.check "0.9.0"]]
  :main ^:skip-aot sicp.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
