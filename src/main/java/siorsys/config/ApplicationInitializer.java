package siorsys.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("siorsys")
@EnableAutoConfiguration
public class ApplicationInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }
}
