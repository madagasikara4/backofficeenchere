package com.demo;

import com.models.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/StatistiqueServlet")
public class StatController {

    @GetMapping
    public Object afficheStat(Model model){
        try{
            String json = AppelWS.getMethod("/statistiques/CAclient");
            Object[] obj= Data.arraytoObj(CAclient.class,json);
            CAclient[] rec=new CAclient[obj.length];
            for (int i = 0; i < obj.length; i++) {
                rec[i]=(CAclient) obj[i];
            }
            model.addAttribute("CAclient",rec);

            json=AppelWS.getMethod("/statistiques/CAcategorie");
            obj= Data.arraytoObj(CAcategorie.class,json);
            CAcategorie[] cat=new CAcategorie[obj.length];
            for (int i = 0; i < cat.length; i++) {
                cat[i]=(CAcategorie) obj[i];
            }
            model.addAttribute("CAcategorie",cat);

            json=AppelWS.getMethod("/statistiques/produitMax");
            Resultat res= (Resultat)Data.maptoObj(Resultat.class,json);
            model.addAttribute("maxprod",res);

            json=AppelWS.getMethod("/statistiques/produitMin");
            res= (Resultat)Data.maptoObj(Resultat.class,json);
            model.addAttribute("minprod",res);

            model.addAttribute("maxcat",null);
            model.addAttribute("badcat",null);

            if(cat.length!=0) {
                model.addAttribute("maxcat", cat[cat.length - 1]);
                model.addAttribute("badcat",cat[0]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "statistique";
    }
}
