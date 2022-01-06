package fh.burgenland.moveme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MovemeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovemeApplication.class, args);
    }

}
