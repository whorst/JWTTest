package com.JWTTest;

import com.JWTTest.models.AuthenticationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

    @Autowired
    AuthenticationManager authenticationManager;

    @RequestMapping("/hello")
    public String HelloString(){
        return "Hello";
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception{
        return null;
    }

}
