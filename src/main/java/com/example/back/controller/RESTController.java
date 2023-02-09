package com.example.back.controller;

import com.example.back.repository.KittyRepository;
import com.example.back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class RESTController {
    private final UserRepository userRepository;

    private final KittyRepository kittyRepository;
    @Autowired
    public RESTController(UserRepository userRepository, KittyRepository kittyRepository) {
        this.userRepository = userRepository;
        this.kittyRepository = kittyRepository;
    }

    @GetMapping("/")
    ResponseEntity<?> index(){
        return new ResponseEntity<>("Zbs", HttpStatus.I_AM_A_TEAPOT);
    }

}
