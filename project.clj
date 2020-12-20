(defproject sdedovic/artlib-cuda "0.0.1-SNAPSHOT"
  :description "A toolkit for creating GPU (via CUDA) accelerated art"
  :url "https://github.com/sdedovic/artlib-cuda"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [quil "3.1.0"]
                 [uncomplicate/clojurecuda "0.10.0"]
                 [uncomplicate/coommons "0.10.0"]
                 [org.jcuda/jcuda "10.1.0"]
                 [org.jcuda/jcurand "10.1.0"]
                 [org.clojure/core.match "1.0.0"]]
  :source-paths ["src/clj", "src/cuda"]
  :java-source-paths ["src/java"]
  :resource-paths ["resources"]
  :aot :all)
