package com.example.fit5120.controller;


import com.example.fit5120.entity.pig;
import com.example.fit5120.service.PigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PigController {
    private PigService pigService;

    @Autowired

    public PigController(PigService pigService) {
        this.pigService = pigService;
    }

    @GetMapping(path = "api/pig")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public pig getPig(){

        return pigService.getPig();

    }
}
