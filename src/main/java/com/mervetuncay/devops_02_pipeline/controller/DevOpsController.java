package com.mervetuncay.devops_02_pipeline.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping
public class DevOpsController {


    @GetMapping
    public String selamVer() {
        return "selam merhaba:  " + LocalDateTime.now();
    }
    


}
