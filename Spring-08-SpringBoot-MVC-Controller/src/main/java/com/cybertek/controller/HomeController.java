package com.cybertek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping("/") // root sign is default, no need to put it!
    public String getRequestMapping(){
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/devops")  // another way
    public String getRequestMapping02(){
        return "home";
    }

    @GetMapping("/spring") // another way
    public String getMapping03(){
        return "home";
    }

//    @PostMapping("/spring") // for post request
//    public String postMapping04(){
//        return "home";
//    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name){
        System.out.println("name is: " + name);
        return "home";
    }

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name,@PathVariable("email") String email){
        System.out.println("name is: " + name);
        System.out.println("email is: " + email);
        return "home";
    }

    @GetMapping("home/course")  // URI format => home/course?course=spring
    public String requestParamEx(@RequestParam("course") String course){
        System.out.println("name is :" + course);
        return "home";
    }

    @GetMapping("home/course2")
    public String requestParam2(@RequestParam(value = "course2",required = false,defaultValue = "Cybertek") String name){
        System.out.println("name is: " + name);
        return "home";
    }


}
