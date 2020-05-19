package springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.service.UserService;

@RestController
@RequestMapping("/test")
public class HelloController{
    @Autowired
    private UserService userService;
    @RequestMapping("/hello")
    public String hello(){
        return userService.register();
    }
}