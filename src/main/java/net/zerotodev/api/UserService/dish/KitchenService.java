package net.zerotodev.api.UserService.dish;

import reactor.core.publisher.Flux;

public class KitchenService {
    Flux<Dish> getDishes(){
        return Flux.just(new Dish("김치찌개"),
                new Dish("떡볶이"),
                new Dish("삼계탕"));

    }
}
