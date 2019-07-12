package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.model.Users;
import com.demo.service.UsersService;


@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UsersService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public Users toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        Users user = this.userService.getUserById(userId);
        return user;
    }
}
