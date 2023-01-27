package com.demo;

import com.models.Categorie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/CategorieUpdate")
public class UpdateCategorie {

    @GetMapping("/{id}/{nom}")
    public Object updateCategorie(@PathVariable String id,@PathVariable String nom, Model model){
        Categorie cat=new Categorie();
        cat.setNomCategorie(nom);
        cat.setIdcategorie(Integer.parseInt(id));
        model.addAttribute("categorie",cat);
        return "updatecategorie";
    }

    @PostMapping
    public Object postupdateCategorie(@RequestParam("nomcategorie") String nom,@RequestParam("idcategorie") String id,Model model){
        try{
            Categorie cat=new Categorie();
            cat.setIdcategorie(Integer.parseInt(id));
            cat.setNomCategorie(nom);
            cat.save();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new RedirectView("CategorieList");
    }
}
