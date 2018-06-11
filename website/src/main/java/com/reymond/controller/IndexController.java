package com.reymond.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ruirli on 2018/6/11.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {

        System.out.println("8888");
        return "static/index.html";
    }
}
