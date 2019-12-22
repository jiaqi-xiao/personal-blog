package com.xjq.blog.web;

import com.xjq.blog.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("The blog is invalid");
//        }
        System.out.println("-----------index----------");
        return "index";
    }
    @GetMapping("/blog")
    public String blog() {
//        int i = 9/0;
//        String blog = null;
//        if (blog == null) {
//            throw new NotFoundException("The blog is invalid");
//        }
        System.out.println("-----------blog----------");
        return "blog";
    }
}
