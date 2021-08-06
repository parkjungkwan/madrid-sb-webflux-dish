package net.zerotodev.api.UserService.item.repository;

import net.zerotodev.api.UserService.item.entity.Item;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends ReactiveCrudRepository<Item, String> {
}
