package sg.edu.nus.iss.vttp5a_day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_day7.model.Carpark;
import sg.edu.nus.iss.vttp5a_day7.service.CarparkService;


@Controller
@RequestMapping("/carparks")
public class CarparkController {
    
    @Autowired
    CarparkService carparkService;

    @GetMapping
    public String getAllCarparks(Model model) {
        List<Carpark> carparks = carparkService.getAllCarparks();
        model.addAttribute("carparks", carparks);

        return "carparks";
    }
}