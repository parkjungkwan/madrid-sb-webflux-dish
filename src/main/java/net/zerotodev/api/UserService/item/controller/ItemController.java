package net.zerotodev.api.UserService.item.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class ItemController {

    @GetMapping
    Mono<?> home(){
        return null;
    }
    // 87p
    @PostMapping("/add/{id}")
    Mono<String> addToCart(@PathVariable String id){
        return null;
    }
}
