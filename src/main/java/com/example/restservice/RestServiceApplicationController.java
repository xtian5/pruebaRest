package com.example.restservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value="/test")
public class RestServiceApplicationController {

    @GetMapping(value = "/getTest")
    public Response getCall(@RequestHeader(value = "name") String name){
        log.info("new rest call with name: {}", name);
        Response response = new Response();
        response.setMessage("Hello " + name);
        return response;
    }
}
