package net.zerotodev.api.UserService.dish;

import reactor.core.publisher.Flux;

public final class MapAndFlatMap {
    public Flux<Integer> justMethod(){ return Flux.just(1,2,3);}
    public Flux<Integer> mapMethod(){ return Flux.just("a", "bc", "def", "wxyz").map(str -> str.length());}
    public Flux<Integer> flatMapMethod(){ return Flux.just(1, 2, 3).flatMap(i -> Flux.range(1, i)); }
    public Flux<Integer> filterMethod(){
        return Flux.range(1, 10).filter(num -> num % 2 == 0);
    }
}
