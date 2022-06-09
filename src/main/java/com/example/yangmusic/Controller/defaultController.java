package com.example.yangmusic.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class defaultController {

    @GetMapping
    public String sayHello() {
        return "欢迎来到我的音乐盒";
    }
}
