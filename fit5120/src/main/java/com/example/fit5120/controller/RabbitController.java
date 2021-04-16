package com.example.fit5120.controller;


import com.example.fit5120.entity.Rabbit;
import com.example.fit5120.service.RabbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {
     private RabbitService rabbitService;

    @Autowired
    public RabbitController(RabbitService rabbitService) {
        this.rabbitService = rabbitService;
    }

    @GetMapping(path = "api/rabbit")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Rabbit getRabbit(){

        return rabbitService.getRabbit();
    }
}
