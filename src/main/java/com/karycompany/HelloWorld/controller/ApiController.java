package com.karycompany.HelloWorld.controller;

import com.karycompany.HelloWorld.Service.ApiService;
import com.karycompany.HelloWorld.request.NameRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/print")
    public @ResponseBody NameRequest printName(@RequestBody NameRequest name){
        return this.apiService.printName(name);
    }

}
