package com.newtonk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类名称：
 * 类描述：
 * 创建人：tq
 * 创建日期：2017/6/15 0015
 */
@Controller
@RequestMapping(value = "/demo")
public class MyController {

    @GetMapping(value = "")
    public String hello(){
        return "index";
    }
}
