package com.plantie.app.plantie.controller;

import com.plantie.app.plantie.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SettingsController {

    private final Plant plant;

    @Autowired
    public SettingsController(Plant plant) {
        this.plant = plant;
    }

    @GetMapping("/settings")
    public String showSettingsPage(Model model) {
        model.addAttribute("plant", plant);
        return "settings";
    }

    @PostMapping("/settings/update")
    public String updateSettings(@ModelAttribute Plant updatedPlant) {
        plant.setName(updatedPlant.getName());
        plant.setMinMoisture(updatedPlant.getMinMoisture());
        plant.setEmail(updatedPlant.getEmail());

        System.out.println("Name: " + plant.getName());
        System.out.println("Moisture: " + plant.getMinMoisture());
        System.out.println("Email: " + plant.getEmail());

        return "redirect:/settings";
    }

    @GetMapping("/index")
    public String showIndexPage(Model model) {
        model.addAttribute("name", plant.getName());
        return "index";
    }

    @GetMapping("/")
    public String redirectToIndex() {
        return "redirect:/index";
    }

}
