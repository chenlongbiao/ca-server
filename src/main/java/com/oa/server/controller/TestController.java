package com.oa.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @RequestMapping("/admin")
    public String test(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return "123";
    }
}
