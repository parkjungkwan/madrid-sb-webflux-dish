package net.zerotodev.api.UserService.dish;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
public class PoliteServer {

    private final KitchenService kitchen;

    Flux<Dish> doingMyJob(){
        return kitchen.getDishes()
                .doOnNext(dish -> System.out.println("감사합니다."+dish))
                .doOnError(error -> System.out.println(error.getMessage()+"  때문에 죄송합니다."))
                .doOnComplete(() -> System.out.println("모든 것이 감사합니다."))
                .map(Dish::deliver);
    }

}
