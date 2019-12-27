package com.study.autoconfiguration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("demo")
@RestController
public class DemoController {

    @GetMapping
    public String get() {
        return "hello";
    }

}
