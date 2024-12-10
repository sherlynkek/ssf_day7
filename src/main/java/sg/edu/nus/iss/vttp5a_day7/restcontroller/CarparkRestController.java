package sg.edu.nus.iss.vttp5a_day7.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sg.edu.nus.iss.vttp5a_day7.model.Carpark;
import sg.edu.nus.iss.vttp5a_day7.service.CarparkRestService;

@RestController
@RequestMapping("/api/carpark")
public class CarparkRestController {

    @Autowired
    CarparkRestService carparkRestService;

    @GetMapping()
    public ResponseEntity<List<Carpark>> getAllCarparks() {
        List<Carpark> carparks = carparkRestService.getAllCarparks();

        return ResponseEntity.ok().body(carparks);
    }
    
}