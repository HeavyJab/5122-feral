package com.example.fit5120.controller;


import com.example.fit5120.entity.Dog;
import com.example.fit5120.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DogController {
    private final DogService dogService;
    
    @Autowired
    public DogController(DogService dogService){
       this.dogService = dogService; 
    }


   @GetMapping(path = "api/dog")
   //@CrossOrigin(origins = "https://keen-brahmagupta-ef5137.netlify.app")
   @CrossOrigin(origins = "*", allowedHeaders = "*")
   public Dog getDog(){

      return dogService.getDog();
   }

}
