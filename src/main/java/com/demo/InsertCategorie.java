package com.demo;

import com.models.Categorie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/CategorieInsert")
public class InsertCategorie {

    @GetMapping
    public Object insertCategorie(){
        return "insertcategorie";
    }

    @PostMapping()
    public Object postinsertCategorie(@RequestParam("nomcategorie") String nom  , Model model){
        try{
            Categorie categorie=new Categorie();
            categorie.setNomCategorie(nom);
            categorie.save();
        }catch(Exception e){
            e.printStackTrace();
        }
        return new RedirectView("CategorieList");
    }
}
