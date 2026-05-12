package be.webtechie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Minimal Spring Boot application to demonstrate Paketo Buildpacks with Azul Zulu.
 *
 * Build the container image (no Dockerfile required):
 *   ./mvnw spring-boot:build-image
 *
 * Run the container:
 *   docker run --rm -p 8080:8080 paketo-demo
 *
 * Check the Java version inside:
 *   docker run --rm paketo-demo java -version
 */
@SpringBootApplication
@RestController
public class PaketoApplication {

    static void main(String[] args) {
        SpringApplication.run(PaketoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Azul Zulu via Paketo!";
    }

    @GetMapping("/version")
    public String version() {
        return "Java " + System.getProperty("java.version")
                + " (Vendor: "
                + System.getProperty("java.vendor")
                + ", version: "
                + System.getProperty("java.vendor.version")
                + ")";
    }
}
