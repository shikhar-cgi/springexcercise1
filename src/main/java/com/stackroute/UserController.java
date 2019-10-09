package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {



    @RequestMapping("/show")
        public ModelAndView show(HttpServletRequest request, HttpServletResponse response)
        {
            UserClass n=new UserClass();
            ModelAndView a=new ModelAndView();
            n.setUsername(request.getParameter("fname"));
            n.setUserpassword(request.getParameter("password"));
            a.setViewName("display.jsp");
            a.addObject("name",n.getUsername());
            a.addObject("password", n.getUserpassword());
            return a;
        }
    }


