package com.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.AppelWS;
import com.models.Data;
import com.models.Rechargement;
import com.models.VRechargement;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validationRecharge")
public class RechargeValidation {

    @GetMapping
    public Object listeValidation(Model model){
        try{
            String json = AppelWS.getMethod("/recharge/validation/0");
            Object[] obj= Data.arraytoObj(VRechargement.class,json);
            VRechargement[] rec=new VRechargement[obj.length];
            for (int i = 0; i < obj.length; i++) {
                rec[i]=(VRechargement) obj[i];
            }
            model.addAttribute("recharge",rec);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "validationRechargement";
    }

    @PostMapping
    public Object valider(Model model, Rechargement rec){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String str = mapper.writeValueAsString(rec);
            String json = AppelWS.putMethod("/recharge",str);
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
        return listeValidation(model);
    }
}
