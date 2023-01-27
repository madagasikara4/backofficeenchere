package com.demo;

import com.models.Categorie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/CategorieList")
public class ListCategorie {

    @GetMapping
    public Object listeCategorie(Model model){
        try {
            Categorie[] categories = Categorie.findAll();
            model.addAttribute("categories",categories);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "listecategorie";
    }
}
