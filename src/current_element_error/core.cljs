(ns current-element-error.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defonce app-state (r/atom true))

(defn sub-component1 []
  ("this is an error" "comment me")
  [:div "1"])

(defn sub-component2 []
  [:div "2"])

(defn main-component []
  [:div
   [:button {:on-click (fn [] (swap! app-state not) nil)} "Toggle"]
   [:div
    (if @app-state
      [sub-component1]
      [sub-component2])]])

(r/render [main-component]
          (.getElementById js/document "app"))
