package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class CusController {
    @RequestMapping("/lwq")
    public String show(){
        return "lwq testfssdfasfsssfaskjfldfasffadf7777776676666777777dsfasfdsaf7";
    }
}
