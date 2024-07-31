/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.learning.helloworldapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Leite Lima
 */
@RestController
public class helloWorldController {
    
    @GetMapping(path="/hello")
    public String helloWorld(){
        return "Hello World! This is the first step of maybe many!";
    }
}
