package com.gokalp.springbootsecurity;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gokalp on 27.12.2022
 * @project SpringBootSecurity
 */
@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {


    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our api");
    }

    @GetMapping("say-good-bye")
    public ResponseEntity<String> sayGoodBy(){
        return ResponseEntity.ok("Good by and see you later");
    }
}
