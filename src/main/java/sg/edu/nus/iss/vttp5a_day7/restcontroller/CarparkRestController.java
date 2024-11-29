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

/* @RestController
@RequestMapping("/api/carpark")
public class CarparkRestController {

    @Autowired
    CarparkRestService carparkRestService;

    @GetMapping()
    public ResponseEntity<List<Carpark>> getCarpark() {
        // Use the CarparkRestService to fetch data
        List<Carpark> carparks = carparkRestService.getCarpark();

        // Return the data as a ResponseEntity
        if (carparks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(carparks);
    }
} */

@RestController
@RequestMapping("/api/carparks")
public class CarparkRestController {
    
    @Autowired
    CarparkRestService carparkService;

    @GetMapping("/rates")
    public ResponseEntity<List<Carpark>> getParkingRates() {
        List<Carpark> carparks = carparkService.getCarparkRates();
        return ResponseEntity.ok().body(carparks);
    }
     
}