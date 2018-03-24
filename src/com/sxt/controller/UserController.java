package com.sxt.controller;

import com.sxt.pojo.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class UserController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("有请求进来");

        List<User> users = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            users.add(new User(i, "老雷" + i, "光谷" + i));
        }
        request.setAttribute("users", users);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
}
