package edu.mum.cs.cs425.crs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/crs", "/crs/home"})
    public String displayHomePage() {
        return "public/home/index";
    }

}
