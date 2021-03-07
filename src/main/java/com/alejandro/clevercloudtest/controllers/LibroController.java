package com.alejandro.clevercloudtest.controllers;

import com.alejandro.clevercloudtest.models.entity.Libro;
import com.alejandro.clevercloudtest.models.entity.dao.ILibroDAO;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LibroController {

    @Autowired
    private ILibroDAO libroDao;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("libros", libroDao.findAll());
        return "home";
    }

    @GetMapping("/form")
    public String form(Model model){
        model.addAttribute("libro", new Libro());
        return "form";
    }

    @PostMapping("/form")
    public String save(Libro libro){
        libroDao.save(libro);
        return "redirect:/";
    }
    
}
