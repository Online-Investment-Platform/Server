package com.example.investment.api.Inquiry_api.controller;


import com.example.investment.api.Inquiry_api.API;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    private API api;

    @GetMapping("/aaa")
    public String fromUrl(String urlstr){
        return api.getJsonFromUrl(urlstr);
    }

}
