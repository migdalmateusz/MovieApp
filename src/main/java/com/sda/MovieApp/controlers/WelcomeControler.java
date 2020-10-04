package com.sda.MovieApp.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeControler {

    private static final String name = "helloMsg";

    @GetMapping("/hello")
    public String showHello(final ModelMap modelMap) {
        modelMap.addAttribute(name, "Mati");
        return "welcome";
    }
}
