package test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class JarsignerApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(
                JarsignerApplication.class);
        application.run(args);
    }

}
