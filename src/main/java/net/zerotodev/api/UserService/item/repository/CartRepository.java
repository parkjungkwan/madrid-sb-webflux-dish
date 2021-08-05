package net.zerotodev.api.UserService.item.repository;

import net.zerotodev.api.UserService.item.entity.Cart;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface CartRepository extends ReactiveCrudRepository<Cart, String> {
}
