(defproject duckling-rest-api "0.1.0-SNAPSHOT"
  :description "A simple restful api for accessing the duckling clojure library"
  :url "http://ongair.im"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-jetty-adapter "1.5.0"]
                 [ongair/duckling "0.4.22.3"]
                 [ring/ring-defaults "0.2.1"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler duckling-rest-api.handler/app, :init duckling-rest-api.handler/start}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
