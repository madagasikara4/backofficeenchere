package com.demo;

import com.models.Photo;
import com.models.Produit;
import com.models.VProduit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/ProduitDureeList")
public class DureeListProduit {

    @GetMapping("/{idcategorie}")
    public Object listProduit(@PathVariable String idcategorie, Model model){
        int idcat=Integer.parseInt(idcategorie);
        try {
            VProduit[] vproduit = VProduit.findValideByCategorie(idcat);
            Photo[] sary = Photo.getPhotoById(vproduit);
            model.addAttribute("vproduit", vproduit);
            model.addAttribute("photo", sary);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "listeproduitcategorie";
    }

    @PostMapping
    public Object updateduree(Model model, Produit produit){
        try{
            Produit.updateDuree(produit.getIdproduit(), produit.getDuree());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new RedirectView("CategorieList");
    }
}
