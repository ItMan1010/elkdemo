package com.itman.elkdemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("elkDemo")
public class eikDemoController {

    /**
     * http://localhost:9386/elkDemo/sayHello?yourname=jack
     */
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public void sayHello(@RequestParam(required = false, name = "yourname") String yourname) {
        log.info("your name is " + yourname);
        //todo
    }
}
