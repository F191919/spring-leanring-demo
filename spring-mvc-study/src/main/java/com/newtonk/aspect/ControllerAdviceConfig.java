package com.newtonk.aspect;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 类名称：
 * 类描述：
 * 创建人：tq
 * 创建日期：2017/6/16 0016
 */
@ControllerAdvice(annotations = Controller.class)
public class ControllerAdviceConfig {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        System.out.println("sadsa");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        webDataBinder.registerCustomEditor(Date.class,new CustomDateEditor(dateFormat, false));
//        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd"));
    }
}
