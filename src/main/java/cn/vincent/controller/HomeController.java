package cn.vincent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "welcome to rocketMq!!!";
    }
}