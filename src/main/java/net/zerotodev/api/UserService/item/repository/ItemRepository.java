package net.zerotodev.api.UserService.item.repository;

import net.zerotodev.api.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;


public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
