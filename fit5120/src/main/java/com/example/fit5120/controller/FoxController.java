package com.example.fit5120.controller;

import com.example.fit5120.entity.Fox;
import com.example.fit5120.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FoxController {
    private final FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping(path = "api/fox")
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public Fox getFox(){

        return foxService.getFox();
    }

}
