package sg.edu.nus.iss.vttp5a_day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import jakarta.json.Json;
import jakarta.json.JsonObjectBuilder;
import sg.edu.nus.iss.vttp5a_day7.model.Joke;
import sg.edu.nus.iss.vttp5a_day7.util.Utility;

@Service
public class JokeService {

    RestTemplate restTemplate = new RestTemplate();
    // @Autowired
    // JokesRestController jokesRestController;
    
    public List<Joke> getAllJokes() {
        // If auto-mapping must use the exact attribute name as in the external api!!
        ResponseEntity<List<Joke>> jokesList = restTemplate.exchange(Utility.jokesUrl, HttpMethod.GET, null, 
        new ParameterizedTypeReference<List<Joke>>() {});
        // should not use parameterizedTypeReference! Use String.class!
        // Then continue below to map the variables using JsonObject/JsonArrayBuilder....

        List<Joke> jokes = jokesList.getBody();

        return jokes;

        // return jokesRestController.getAllJokes().getBody();
    }

    public void addJoke(Joke j) {
       JsonObjectBuilder job = Json.createObjectBuilder();
       job.add("type", j.getType());
       job.add("setup", j.getSetup());
       job.add("punchline", j.getPunchline());
       job.add("id", j.getId());

       String requestPayload = job.build().toString();

    }
}