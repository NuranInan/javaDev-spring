package com.cybertek.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/")  //default end point
    public String getRequestMapping() {
        return "home";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/ozzy")
    public String getRequestMapping2() {
        return "home";

    }

    @RequestMapping(method = RequestMethod.POST, value = "/ozzy")
    public String getRequestMapping3() {
        return "home";

    }

    @GetMapping("/spring")
    public String getMappingEx() {
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingEx2() {
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name) {
        System.out.println("name is:" + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email) {
        System.out.println("name is:" + name);
        System.out.println("email is:" + email);
        return "home";
    }
    //option 1
    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course")String course){
        System.out.println("name is :"+ course);
        return "home";
    }
    //another option with query parameter
    //default cybertek will come==>  http://localhost:8080/home/course2?course2 (=income request)
    //http://localhost:8080/home/course2?course2=mvc
    @GetMapping("home/course2")
    public String requestParam2(@RequestParam(value= "course2", required = false,defaultValue = "Cybertek")String name){
        System.out.println("name is :"+ name);
        return "home";
    }
}
