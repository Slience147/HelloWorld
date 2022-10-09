package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author lilu
 * @Description // TODO
 * @Date 2022/10/9 17:09
 **/
@RestController
@RequestMapping("test")
public class TestController {

    @ResponseBody
    @RequestMapping("hello")
    public String helloWorld(){
        return new Date()+"---hello world!!!";
    }

}
