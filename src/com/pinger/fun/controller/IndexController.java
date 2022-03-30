package com.pinger.fun.controller;

import com.pinger.fun.model.EvalBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author : p1n93r
 * @date : 2022/3/30 12:42
 */

@RestController
public class IndexController {

    @RequestMapping("/index")
    public void index(EvalBean evalBean){
        System.out.println("=================");
        System.out.println(evalBean);
        System.out.println("=================");
    }


    @InitBinder
    public void initBinder(WebDataBinder binder) {
//        String[] blackList = {"class.*","Class.*","*.class.*",".*Class.*"};
//        binder.setDisallowedFields(blackList);
    }

}
