package com.marceloserpa.bookstore.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @RestController
    public class BookEndpoint {

        @RequestMapping(method = RequestMethod.GET, value = "/books")
        public List<String> getAllBooksNames(){
            return Arrays.asList(
                    "The shining", "The dunwich horror"
            );
        }

    }

}
