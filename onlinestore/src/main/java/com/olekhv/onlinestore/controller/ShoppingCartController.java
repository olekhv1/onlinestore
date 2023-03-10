package com.olekhv.onlinestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.olekhv.onlinestore.dto.ShoppingCartDTO;
import com.olekhv.onlinestore.service.ShoppingCartService;

@RestController
@RequestMapping("/api/v1/shoppingCart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getShoppingCart(@PathVariable Long id){
        return ResponseEntity.ok(shoppingCartService.fetchShoppingCartById(id));
    }

    @PostMapping
    public ResponseEntity<?> generateShoppingCart(@RequestBody ShoppingCartDTO shoppingCartDTO){
        return ResponseEntity.ok(shoppingCartService.generateShoppingCart(shoppingCartDTO));
    }
}
