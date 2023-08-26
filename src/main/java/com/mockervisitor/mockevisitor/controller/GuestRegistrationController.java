package com.mockervisitor.mockevisitor.controller;

import com.mockervisitor.mockevisitor.model.RegisterResponse;
import com.mockervisitor.mockevisitor.model.Registration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evisitor")
public class GuestRegistrationController {

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> registerGuest(@RequestBody Registration registration){
        return ResponseEntity.status(HttpStatus.OK).body(new RegisterResponse("Guest successfully registered"));
    }
}
