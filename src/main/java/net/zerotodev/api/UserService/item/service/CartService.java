package net.zerotodev.api.UserService.item.service;

import net.zerotodev.api.UserService.item.entity.Cart;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class CartService {
    Mono<Cart> addToCart(String cartId, String id) {
        return null;
    }
}