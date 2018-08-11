package edu.mum.cs.cs425.crs.controller;

import edu.mum.cs.cs425.crs.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    @GetMapping(value = "/crs/login")
    public String displayLoginPage(Model model) {
        model.addAttribute("user", new User());
        return "public/login";
    }

    @PostMapping(value = "/crs/login")
    public String addNewProduct(@Valid @ModelAttribute("user") User user,
                                BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("errors", bindingResult.getAllErrors());
            return "public/login";
        }
//        user = userLoginService.auth(user);
        return "redirect:/crs/home";
    }
}
