package com.example.dummyservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {


    @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "text/plain")
    public String GetDummy() {
        return "hello dummy";
    }
}
