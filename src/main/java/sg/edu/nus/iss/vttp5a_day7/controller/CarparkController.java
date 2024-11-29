package sg.edu.nus.iss.vttp5a_day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.edu.nus.iss.vttp5a_day7.model.Carpark;
import sg.edu.nus.iss.vttp5a_day7.service.CarparkService;


/* @Controller
@RequestMapping("/carpark")
public class CarparkController {

    @Autowired
    CarparkService carparkService;

    @GetMapping
    public String carparkList(Model model) {
        List<Carpark> carpark = carparkService.getCarparkList();
        model.addAttribute("carpark", carpark);
        return "carparklist";
    }
} */

@Controller
@RequestMapping("/carparks")
public class CarparkController {
    
    @Autowired
    CarparkService carparkService;

    @GetMapping
    public String carparkListing(Model model) {

        List<Carpark> carparks = carparkService.getCarparkList();
        model.addAttribute("carparks", carparks);
        return "carparklist";
    }
}
