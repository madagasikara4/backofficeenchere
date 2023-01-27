package com.demo;

import com.models.Benefice;
import com.models.Commission;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/ServletCommission")
public class CommissionController {

    @GetMapping
    public Object listeCommission(Model model){
        try{
            Commission commission=Commission.findById(1);
            float benef= Benefice.getValeurBenefice();
            model.addAttribute("commission",commission);
            model.addAttribute("benefice",benef);


        }catch(Exception e){
            e.printStackTrace();
        }
        return "UpdateCommission";
    }

    @PostMapping
    public Object updateCommission(Model model,Commission com){
        try{
            com.update();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return listeCommission(model);
    }
}
