package com.Health.Controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> index()
    {
        return new ResponseEntity("This is the index", HttpStatus.OK);
    }

    @GetMapping("/home")
    public ResponseEntity<String> home()
    {
        return new ResponseEntity("This is the home", HttpStatus.OK);
    }
}
