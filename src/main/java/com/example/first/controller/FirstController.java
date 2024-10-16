package com.example.first.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String NiceToMeetYou(Model model){
        model.addAttribute("username", "지상");
        return "greetings";
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model){
        model.addAttribute("nickname", "지상동") ;
        return "goodbye";
    }
}
