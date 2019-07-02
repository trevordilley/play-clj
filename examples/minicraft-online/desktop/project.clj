(load-file "project_versions.clj")

(defproject minicraft-online "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  
  :dependencies [[com.badlogicgames.gdx/gdx ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-box2d ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-box2d-platform ~lib-gdx-version
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-bullet ~lib-gdx-version]
                 [com.badlogicgames.gdx/gdx-bullet-platform ~lib-gdx-version
                  :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-platform ~lib-gdx-version
                  :classifier "natives-desktop"]
                 [org.clojure/clojure ~clj-version]
                 [play-clj ~play-clj-version]
                 [play-clj.net ~play-clj-net-version]
                 [prismatic/schema ~prismatic-schema-version]]
  
  :source-paths ["src" "src-common"]
  :javac-options ["-target" ~java-version "-source" ~java-version "-Xlint:-options"]
  :aot [minicraft-online.core.desktop-launcher]
  :main minicraft-online.core.desktop-launcher)
