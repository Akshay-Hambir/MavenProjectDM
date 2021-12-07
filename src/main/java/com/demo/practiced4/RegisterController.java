package com.demo.practiced4;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//public class RegisterController implements Controller {  //This is when bean tag is present in mvc-servlet.xml
    @Controller
    public class RegisterController {
    @RequestMapping("/register.spring")
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
       ModelAndView ref = new ModelAndView("next");
       ref.addObject("key","Data");
       return ref;
    }
}
