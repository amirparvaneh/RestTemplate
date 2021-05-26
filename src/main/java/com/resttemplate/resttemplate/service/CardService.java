package com.resttemplate.resttemplate.service;

import com.resttemplate.resttemplate.Card;
import org.springframework.stereotype.Service;

@Service
public interface CardService {
    public Card saveUpdateCard(Card card);
    public Card findById(String id);
}
