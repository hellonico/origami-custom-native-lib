# origami-simple

This is an origami sample with backward compatibility of opencv down to libc 2.19. 

```
:dependencies [   
  [origami "4.0.0-beta6"]
  [opencv/opencv-native-linux_64 "4.0.0-beta"]
  [org.clojure/clojure "1.8.0"]]
```

# install clj

```
clj_version=1.9.0.397
script_file="linux-install-$clj_vesion.sh"
curl -O https://download.clojure.org/install/$script_file
chmod +x $script_file
sudo ./$script_file
rm $script_file
sudo apt install rlwrap
```

# docker 

```
docker build -t my-origami-app .
docker run -it --name running-origami-app my-origami-app
```