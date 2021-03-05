package com.koznem.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {

    @GetMapping("/vets")
    public String listVets(){
        return "vets/index";
    }
}
