package com.beehyv.helloworld.Controller;

import com.beehyv.helloworld.model.greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

public class greetingController {




    @RestController
    public class GreetingController {

        private static final String template = "Hello, %s!";
        private final AtomicLong counter = new AtomicLong();

        @GetMapping("/greeting")
        public greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
            return new greeting(counter.incrementAndGet(), String.format(template, name));
        }
    }





}
