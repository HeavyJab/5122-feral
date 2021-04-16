package com.example.fit5120.controller;


import com.example.fit5120.entity.Goat;
import com.example.fit5120.service.GoatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoatController {
    private GoatService goatService;

    @Autowired
    public GoatController(GoatService goatService) {
        this.goatService = goatService;
    }
    @GetMapping(path = "api/goat")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Goat getGoat(){

      return goatService.getGoat();
    }
}
