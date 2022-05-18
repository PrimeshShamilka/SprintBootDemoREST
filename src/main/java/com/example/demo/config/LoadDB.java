package com.example.demo.config;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        User user1 = new User();
        User user2 = new User();
        user1.setUserName("User1");
        user1.setUserAge(25);
        user2.setUserName("User2");
        user2.setUserAge(30);

        return args -> {
            log.info("Preloading " + repository.save(user1));
            log.info("Preloading " + repository.save(user2));
        };
    }
}
