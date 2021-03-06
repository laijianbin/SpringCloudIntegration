package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import io.servicecomb.springboot.starter.provider.EnableServiceComb;

@SpringBootApplication
@EnableAutoConfiguration
@EnableServiceComb
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
