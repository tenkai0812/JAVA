package com.kaicode.web.user;

import java.time.LocalDate;
import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebuserConfig {

    @Bean
    CommandLineRunner commandLineRunner(WebuserRepository repository){
        return args -> {
            Webuser Ken = new Webuser(
                1L,
                "Ken",
                "Ken@gmail.com",
                new Date(),
                new Date(),
                LocalDate.of(1990, 8, 12)
            );

            Webuser Candy = new Webuser(
                2L,
                "Candy",
                "Candy@gmail.com",
                new Date(),
                new Date(),
                LocalDate.of(1990, 8, 12)
            );

            repository.saveAll(
                List.of(Ken, Candy)
            );
        };
    }
}