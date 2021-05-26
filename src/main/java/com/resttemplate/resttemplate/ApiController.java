package com.resttemplate.resttemplate;

import com.resttemplate.resttemplate.service.CardServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private CardServiceImp cardServiceImp;
    private static final String url = "https://rest.eu/countries/all";
//    private static String url = "https://google.com";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/lang")
    public List<Object> getCountries() {
        Object[] result = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(result);
    }

    @GetMapping(path = "/getOne/{name}", consumes = "application/json", produces = "application/json")
    public String getOneName(@PathVariable String name) {
        return "hello " + "j" + name;
    }

    @PostMapping(value = "/create", consumes = "application/json", produces = "application/json")
    public List<Object> getCapital() {
        Object[] result = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(result);
    }


//    @PostMapping("/jpa/users/{dest}/card")
//    public ResponseEntity<Object> createPost(@PathVariable String dest, @RequestBody Card card) {
//
//        Optional<Card> userOptional = userRepository.findById(dest);
//
//        if (!userOptional.isPresent()) {
//            throw new UserNotFoundException("dest-" + dest);
//        }
//
//        Card user = userOptional.get();
//
//        card.setUser(user);
//
//        pos.save(post);
//
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId())
//                .toUri();
//
//        return ResponseEntity.created(location).build();
//    }


    @PostMapping(path = "/getCard")
    public String getCardName(@RequestBody Card card) {
        return card.toString();
    }
}
