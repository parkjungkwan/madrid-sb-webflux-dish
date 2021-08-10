package net.zerotodev.api.UserService.inheritance;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class ItemService {
    private final ItemRepository itemRepository;

}
