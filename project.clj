(load-file "project_versions.clj")

(defproject play-clj "1.2.0-SNAPSHOT"
  :description "A libGDX wrapper for easy cross-platform game development"
  :url "https://github.com/trevordilley/play-clj"
  :license {:name "Public Domain"
            :url "http://unlicense.org/UNLICENSE"}
  :dependencies [[com.badlogicgames.gdx/gdx ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-box2d ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-bullet ~lib-gdx-version]
                 [org.clojure/clojure ~clj-version]]
  :profiles {:dev {:dependencies [[pjstadig/humane-test-output "0.9.0"]]
                   :injections [(require 'pjstadig.humane-test-output)
                              (pjstadig.humane-test-output/activate!)]
                   :plugins [[com.jakemccrary/lein-test-refresh "0.24.1"]]
                   :test-refresh {:notify-command ["terminal-notifier" "-title" "Tests" "-message"]
                                  :quiet true
                                  :changes-only true}}}
  :repositories [["sonatype"
                  "https://oss.sonatype.org/content/repositories/releases/"]]
  :source-paths ["src"]
  :test-paths ["test"]
  :java-source-paths ["src-java"]
  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"])
