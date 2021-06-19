package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        logger.info("initializing users");

        User u1 = new User("Kiran", "Nathe", "kiran.nathe@gmail.com");
        userRepository.save(u1);
    }
}