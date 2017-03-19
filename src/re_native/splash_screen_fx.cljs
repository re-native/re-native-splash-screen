(ns re-native.splash-screen-fx
  (:require [reagent.core :as r]
            [re-native.splash-screen :refer [hide-splash-screen]]
            [re-frame.core :as re]))

(re/reg-fx
  :hide-splash-screen
  (fn hide-splash-screen-fx [{:keys []}]
    (hide-splash-screen)))
