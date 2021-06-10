package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controllre {

    @GetMapping("/")
    public ModelAndView str(Model model)
    {
        ModelAndView m = new ModelAndView();
        m.setViewName("home");
        m.addObject("namee","bakchodi");
        return m;
    }
}
