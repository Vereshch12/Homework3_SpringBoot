package com.example.homework3_springboot.service;

import com.example.homework3_springboot.model.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketService {
    private final Basket basket;

    public BasketService(Basket basketFromRepository){
        this.basket = basketFromRepository;
    }

    public void addToBasket(List<Integer> ids){
        this.basket.addIdsToBasket(ids);
    }

    public List<Integer> getBasket(){
        return this.basket.getIdsFromBasket();
    }
}
