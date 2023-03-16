package com.Health.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/" )
    public String index()
    {
        return "Home Index";
    }
    @GetMapping(value = "/hello")
    public String hello()
    {
        return "Hello Home!";
    }
}
