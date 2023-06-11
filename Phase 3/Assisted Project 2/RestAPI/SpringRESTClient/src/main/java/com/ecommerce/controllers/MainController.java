package com.ecommerce.controllers;

import com.ecommerce.beans.Quote;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Quote> response = restTemplate.getForEntity("https://api.quotable.io/random", Quote.class);
        Quote quote = response.getBody();

        String result = "<h1>Random Quote</h1>" +
                "<p><strong>Text: </strong>" + quote.getContent() + "</p>" +
                "<p><strong>Author: </strong>" + quote.getAuthor() + "</p>";

        return result;
    }
}
