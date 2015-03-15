(defproject ciste/ciste-service-tigase "0.4.0-SNAPSHOT"
  :description "Tigase Connector Service for Ciste Applications"
  :url "http://github.com/duck1123/ciste"
  :author "Daniel E. Renfer <duck@kronkltd.net>"
  :min-lein-version "2.0.0"
  :dependencies [[ciste "0.6.0-SNAPSHOT"]
                 [clj-tigase "0.2.0-SNAPSHOT"]]
  :profiles {:dev
             {:dependencies
              [[log4j "1.2.17"]
               [midje "1.7.0-SNAPSHOT"]
               [org.slf4j/slf4j-log4j12 "1.7.10"]]}}
  :plugins [[codox "0.8.10"]
            [lein-midje "3.1.3"]]
  :autodoc {:name "Ciste Service Tigase"
            :copyright "2015 KRONK Ltd."})
