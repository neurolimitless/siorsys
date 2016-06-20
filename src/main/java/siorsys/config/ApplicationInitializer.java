package siorsys.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;


@EnableAutoConfiguration
@ComponentScan("siorsys")
@Configuration
public class ApplicationInitializer extends SpringBootServletInitializer implements WebApplicationInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationInitializer.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationInitializer.class, args);
    }
}
