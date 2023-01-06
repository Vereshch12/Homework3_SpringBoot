package com.example.homework3_springboot.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@SessionScope
@Component
public class Basket {
    private final List<Integer> basket = new ArrayList<>();

    public void addIdsToBasket(List<Integer> ids){
        this.basket.addAll(ids);
    }

    public List<Integer> getIdsFromBasket(){
        return this.basket;
    }
}
