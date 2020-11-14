package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mentor")//ayni metottan student controllerdada var hata veriyor @requestmapping yapip spesify ediyoruz parantezle
//uri student/show
public class MentorController {

    @GetMapping("/show")
    public String showForm(){
        return "home";
    }

}
