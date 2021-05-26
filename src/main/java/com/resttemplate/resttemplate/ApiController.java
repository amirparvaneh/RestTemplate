package com.resttemplate.resttemplate;


import com.resttemplate.resttemplate.service.CardService;
import com.resttemplate.resttemplate.service.CardServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ApiController {

    private static final String url = "https://restcountries.eu/rest/v2/capital/{capital}";
//    private static String url = "https://google.com";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/lang")
    public List<Object> getCountries() {
        Object[] result = restTemplate.getForObject(url,Object[].class);
        return Arrays.asList(result);
    }

    @GetMapping(path = "/getOne/{name}",consumes = "application/json",produces = "application/json")
    public String getOneName(@PathVariable String name){
        return "hello "+ "j"+ name;
    }
    @PostMapping(value = "/create",consumes = "application/json",produces = "application/json")
    public List<Object> getCapital() {
        Object[] result = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(result);
    }
    @PostMapping(path = "/getCard")
    public String getCardName(@RequestBody Card card){
        return card.toString();
    }
}
