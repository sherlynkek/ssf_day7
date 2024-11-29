package sg.edu.nus.iss.vttp5a_day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import sg.edu.nus.iss.vttp5a_day7.constant.Url;
import sg.edu.nus.iss.vttp5a_day7.model.Carpark;
import sg.edu.nus.iss.vttp5a_day7.repo.ListRepo;

/* @Service
public class CarparkService {

    @Autowired
    ListRepo carparkRepo;

    RestTemplate restTemplate = new RestTemplate();

    public List<Carpark> getCarparkList() {
        ResponseEntity<List<Carpark>> carparks = restTemplate.exchange(Url.carparkUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Carpark>>() {});

        return carparks.getBody();
    }
} */
@Service
public class CarparkService {
    
    RestTemplate restTemplate = new RestTemplate();

    public List<Carpark> getCarparkList() {
        ResponseEntity<List<Carpark>> carparks = restTemplate.exchange(Url.localCarparkUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Carpark>>() {});

        return carparks.getBody();

    }
}
