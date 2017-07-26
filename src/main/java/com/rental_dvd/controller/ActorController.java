package com.rental_dvd.controller;

import com.rental_dvd.entity.Actor;
import com.rental_dvd.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ActorController {

    @Autowired
    private ActorService actorService;


    @GetMapping("/actor")
    public String actor(Model model){
        model.addAttribute("actors", actorService.findAll());
        model.addAttribute("actor", new Actor());
        return "actor";
    }

    @PostMapping("/actor")
    public String save(@ModelAttribute Actor actor, Model model){
        actorService.save(actor);
        model.addAttribute("actors", actorService.findAll());
        return "redirect:/actor";
    }

    @GetMapping("deleteActor/{id}")
    public String delete(@PathVariable int id){
        actorService.delete(id);
        return "redirect:/actor";
    }

}
