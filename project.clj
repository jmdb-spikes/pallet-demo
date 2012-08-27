(defproject pallet-demo "0.1.0-SNAPSHOT"
  :description "FIXME Pallet project for pallet-demo"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.cloudhoist/pallet "0.7.1"]
                 [org.cloudhoist/pallet-jclouds "1.3.0-beta.1"]
                 [org.jclouds/jclouds-allblobstore "1.3.2"]
                 [org.jclouds/jclouds-allcompute "1.3.2"]
                 [org.jclouds.driver/jclouds-slf4j "1.3.2"]
                 [org.slf4j/slf4j-api "1.6.1"]
                 [ch.qos.logback/logback-core "1.0.0"]
                 [ch.qos.logback/logback-classic "1.0.0"]]
  :dev-dependencies [[org.cloudhoist/pallet
                      "0.7.1" :type "test-jar"]
                     [org.cloudhoist/pallet-lein "0.5.1"]]
  :profiles {:dev {:plugins [[org.cloudhoist/pallet-lein "0.5.1"]]}}
  :local-repo-classpath true
  :repositories
  {"sonatype-snapshots" "https://oss.sonatype.org/content/repositories/snapshots"
   "sonatype" "https://oss.sonatype.org/content/repositories/releases/"})
