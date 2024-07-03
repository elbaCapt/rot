package com.sprint5T1N2.rot.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public Mono<String> hello() {
        return Mono.just("Hello, World!");    //prints Hello, World!
    }


    @GetMapping("/bye")
    public Mono<String> bye() {
        return Mono.just("Bye, bye cruel word...");    //prints Hello, World!
    }

}
