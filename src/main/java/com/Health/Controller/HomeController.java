package com.Health.Controller;

import com.Health.Application.PatientApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    PatientApplication patientApplication = new PatientApplication();

    @RequestMapping(value = "/" )
    public String index()
    {
        return "Home Index";
    }
    @GetMapping(value = "/hello")
    public String hello()
    {
        patientApplication.prueba();
        return "guadamos primer paciente";

    }
}
