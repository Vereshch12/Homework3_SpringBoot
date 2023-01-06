package com.example.homework3_springboot.controller;

import com.example.homework3_springboot.service.BasketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
    private final BasketService basketService;

    public OrderController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> ids){
        this.basketService.addToBasket(ids);
    }

    @GetMapping("/get")
    public List<Integer> get(){
        return this.basketService.getBasket();
    }
}
