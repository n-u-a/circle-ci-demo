package com.example.demopro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping({ "/", "/index" })
    public ModelAndView get(ModelAndView mav) {
        mav.setViewName("circle-ci-share");
        return mav;
    }
}
