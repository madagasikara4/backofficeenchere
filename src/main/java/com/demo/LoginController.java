package com.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.models.Admin;
import com.models.AppelWS;
import com.models.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/LoginServlet")
public class LoginController {

    @PostMapping()
    public Object login(Model model, Admin admin){
        try {
            ObjectMapper mapper = new ObjectMapper();
            String str = mapper.writeValueAsString(admin);
            String json = AppelWS.postMethod("/admin/login", str);
            Object val = Data.toObj(json);
            if ((boolean) val == false) {
               return "index";
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new RedirectView("validationRecharge");
    }
}
