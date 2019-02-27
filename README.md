# origami-simple

This is an origami sample with backward compatibility of opencv compiled with libc 2.19.

```
:dependencies [   
  [origami "4.0.0-2"]
  [org.clojure/clojure "1.8.0"]]
```

or deps.edn 

```
{:mvn/repos
 {
 	"vendredi" {:url "https://repository.hellonico.info/repository/hellonico/"}
 }
 :deps { 
    origami {:mvn/version "4.0.0-2"}
 }
}
```

# docker 

This also allows to run directly on a docker container and a Dockerfile is included here.

```
docker build -t my-origami-app .
docker run -it --name running-origami-app my-origami-app
```