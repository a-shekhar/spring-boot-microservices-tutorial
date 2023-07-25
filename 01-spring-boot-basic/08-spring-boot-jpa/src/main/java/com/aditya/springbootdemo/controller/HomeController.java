package com.aditya.springbootdemo.controller;


import com.aditya.springbootdemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    // by default its always get method
    // @RequestMapping("/user")

    // also can use this
    @GetMapping("/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("aditya");
        user.setEmail("aditya@adimail.com");

        return user;
    }

    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id, @PathVariable("id2") String name) {
        return "The Path variable is: " + id + " " + name;
    }

    // http://localhost:8080/requestParam?name=Aditya
    //http://localhost:8080/requestParam?name=Aditya&email=adi@mail.com
    //http://localhost:8080/requestParam?name=Aditya&emailid=adi@mail.com
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name, @RequestParam(name = "emailid", required = false, defaultValue = "") String email){
        return "Your name is: " + name + " and email ID is: " + email;
    }
}
