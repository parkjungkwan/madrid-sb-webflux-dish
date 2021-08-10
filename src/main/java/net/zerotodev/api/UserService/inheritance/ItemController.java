package net.zerotodev.api.UserService.inheritance;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RestController;

@RestController @RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;


}
