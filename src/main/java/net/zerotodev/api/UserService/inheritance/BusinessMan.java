package net.zerotodev.api.UserService.inheritance;

import lombok.Data;

@Data
class Man {
    private String name;
}

@Data
class BusinessMan extends Man{
    private final String company;
    private final String position;

}
