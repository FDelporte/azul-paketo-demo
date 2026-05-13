# Demo using Azul Zulu with Paketo Buildpacks

**Minimal Maven application to demonstrate the use of Azul Zulu with Paketo Buildpacks.**

## More Information

This repository contains the demo files explained in the blog post [TODO]().

## Building the Containers

You can build the Paketo container using Spring Boot:

```shell
# Default config with JRE
$ mvn spring-boot:build-image

# Custom JRE with jlink
$ mvn spring-boot:build-image -f pom-jlink.xml

# Debug version with full JDK
$ mvn spring-boot:build-image -f pom-debug.xml
```


