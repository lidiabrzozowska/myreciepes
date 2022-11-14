package com.lydia.my_reciepes.controller;

import com.lydia.my_reciepes.entity.Dish;
import com.lydia.my_reciepes.repository.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dish")
@AllArgsConstructor
public class DishController {

    private DishRepository dishRepository;

    @GetMapping("/add/")
    String addDish(Model model){
        model.addAttribute("dish", new Dish());
        return "form";
    }

    @GetMapping("/edit/{id}")
    String editDish(Model model,@PathVariable Long id){
        model.addAttribute("dish",
                dishRepository.findById(id).orElse(null));
        return "form";
    }

    @PostMapping("/save/")
    String postAddDish(@Validated Dish dish, BindingResult result){
        if (result.hasErrors()) {
            return "form";
        }
        dishRepository.save(dish);
        return "redirect:/dish/";
    }

    @GetMapping("/")
    String listDish(Model model){
        model.addAttribute("dishs",
                dishRepository.findAll());
        return "list";
    }

    @GetMapping("/delete/{id}/")
    String deleteDish(Model model,@PathVariable Long id){
        model.addAttribute("dish",
                dishRepository.findById(id).orElse(null));
        return "confirm_delete";
    }

    @PostMapping("/delete/{id}/")
    String postDelete(@PathVariable Long id,
                      @RequestParam(required = false) String delete){
        if(delete != null) {
            dishRepository.deleteById(id);
        }
        return "redirect:/dish/";
    }


}
