package com.example.homework4;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/json")
public class JsonController {

    @PostMapping(value="/test", consumes = "application/json")
    public JsonTest modifyJson(@RequestBody JsonTest json){
        json.info.put("id", 123);
        return json;
    }
}
