package com.koznem.sfgpetclinic.controllers;

import com.koznem.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    public final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @GetMapping({"/vets","/vets.html"})
    public String listVets(Model model){

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
