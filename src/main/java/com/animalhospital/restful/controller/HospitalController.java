package com.animalhospital.restful.controller;

import org.springframework.web.bind.annotation.*;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RequestMapping("/restful")
@RestController
public class HospitalController {

    @GetMapping("/hospital")
    public String getHospital(){
        return "test";
    }

    @PostMapping("/hospital")
    public String create(Object memberForm){
        Object member = new Object();

        return "redirect:/";
    }

}
