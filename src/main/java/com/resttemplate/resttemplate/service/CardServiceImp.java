package com.resttemplate.resttemplate.service;

import com.resttemplate.resttemplate.Card;

import java.util.ArrayList;
import java.util.List;

public class CardServiceImp implements CardService {
    private static List<Card> listofcard = new ArrayList<>();
    static {
        listofcard.add(new Card("f1111111","ali","jonas","parsian", "aaaaaaa"));
        listofcard.add(new Card("f222222222","faza","bui","parsian", "a5ted"));
        listofcard.add(new Card("f333333","reza","chao","parsian", "a234r"));
        listofcard.add(new Card("f444444","nana","nilo","parsian", "aegerfgaa"));
        listofcard.add(new Card("f555555","jaja","chen","parsian", "wegfea"));
    }
    @Override
    public Card saveUpdateCard(Card card) {
        return null;
    }

    @Override
    public Card find(String dest) {
         return null;
    }
}
