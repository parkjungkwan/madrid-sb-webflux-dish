package net.zerotodev.api.UserService.dish;

import lombok.Data;

@Data public class Aclass {
    private final Bclass b1;

    public void some(){
        Bclass b2 = new Bclass();
        b2.getName();
    }

}
@Data class Bclass{
    private String name;

}
