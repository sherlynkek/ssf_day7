package sg.edu.nus.iss.vttp5a_day7.service;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;
import jakarta.json.JsonValue;
import sg.edu.nus.iss.vttp5a_day7.constant.Url;
import sg.edu.nus.iss.vttp5a_day7.model.Carpark;

@Service
public class CarparkRestService {
    
    RestTemplate restTemplate = new RestTemplate();

    public List<Carpark> getCarpark() {
        
        String carparkData = restTemplate.getForObject(Url.carparkUrl, String.class);
        
        JsonReader jReader = Json.createReader(new StringReader(carparkData));
        JsonArray jArray = jReader.readArray();

        // JsonObject jDataObject = jObject.getJsonObject("data");

        List<Carpark> carparks = new ArrayList<>();

        for(int i = 0; i < jArray.size(); i++) {
            JsonObject jObject = jArray.getJsonObject(i);

            Carpark c = new Carpark();


        }
        return null;
        
    }
}
