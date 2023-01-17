package com.olekhv.onlinestore.dto;

import lombok.*;
import com.olekhv.onlinestore.entity.CartItem;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class ShoppingCartDTO {
    private List<CartItem> cartItems;
}
