# origami-with-custom-lib

This shows how to use origami with a custom compiled opencv library.
You simply put your native lib in the natives folder, and run examples with Leiningen:

```
lein run -m simple.core
lein run -m simple.video
```


or the Clojure cli

```
clj -Acore
clj -Avideo
```