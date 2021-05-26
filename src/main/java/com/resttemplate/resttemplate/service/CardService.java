package com.resttemplate.resttemplate.service;

import com.resttemplate.resttemplate.Card;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Component
public interface CardService {
    public Card saveUpdateCard(Card card);
    public Card find(String id);
}
