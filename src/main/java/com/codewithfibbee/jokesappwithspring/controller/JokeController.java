package com.codewithfibbee.jokesappwithspring.controller;

import com.codewithfibbee.jokesappwithspring.service.JokeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class JokeController {
    private final JokeService jokeService;

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}
