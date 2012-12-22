(defproject ciste/ciste-service-tigase "0.4.0-SNAPSHOT"
  :description "Tigase Connector Service for Ciste Applications"
  :url "http://github.com/duck1123/ciste"
  :author "Daniel E. Renfer <duck@kronkltd.net>"
  :min-lein-version "2.0.0"
  :dependencies [[ciste/ciste-core "0.4.0-SNAPSHOT"]
                 [clj-tigase "0.1.0"]]
  :profiles {:dev
             {:dependencies
              [[log4j "1.2.17"]
               [midje "1.5-alpha3"]]}}
  :plugins [[codox "0.6.4"]
            [lein-midje "2.0.3"]]
  :autodoc {:name "Ciste Service Tigase"
            :copyright "2012 KRONK Ltd."})
