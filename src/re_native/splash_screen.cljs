(ns re-native.splash-screen
  (:require [reagent.core :as r]
            [re-frame.core :as re]))

(def react-native-splash-screen (js/require "react-native-splash-screen"))
(def hideSplashScreen (.-hide react-native-splash-screen))

(assert react-native-splash-screen)
(assert hideSplashScreen)

(defn hide-splash-screen [] (hideSplashScreen))
