package com.example.homework4;

import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/getHeaders")
public class GetController {

    @GetMapping(value="/test")
    public void test(@RequestHeader MultiValueMap<String, String> headers){
        headers.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
