package com.lydia.my_reciepes.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MainController {
    @GetMapping("/")
    @ResponseBody
    String main() {
        return "<h1> My Reciepes</h1>";
    }

//    @GetMapping("/index/")
//    String index(Model model) {
//        List<String> names = List.of("Anna", "Ela", "Hela");
//        model.addAttribute("message", "Pierwsza wiadomość w template!");
//        model.addAttribute("names", names);
//        return "index";
//    }
}
