package com.resttemplate.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ApiController {

    private static final String url = "https://restcountries.eu/rest/v2/lang/es";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/lang")
    public List<Object> getCountries(){
        Object[] result = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(result);
    }
}
