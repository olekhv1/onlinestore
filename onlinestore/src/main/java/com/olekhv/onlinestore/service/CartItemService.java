package com.olekhv.onlinestore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.olekhv.onlinestore.entity.CartItem;
import com.olekhv.onlinestore.repository.CartItemRepository;

import java.util.List;

@Service
@Slf4j
public class CartItemService {
    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public List<CartItem> fetchCartItemsByShoppingCartId(Long id){
        return cartItemRepository.findCartItemsByShoppingCartId(id);
    }
}
