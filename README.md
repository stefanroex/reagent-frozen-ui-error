# Reagent: UI freezes after error

1. `lein figwheel`
2. Open browser, check the console if the initial error is triggered. It should read: `Error rendering component [...]`.
3. Remove the code which caused the error in core.cljs line 9.
4. Hit the toggle button. You will see the UI is frozen and the console show an `_currentElement` error.
