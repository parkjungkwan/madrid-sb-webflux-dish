package net.zerotodev.api.UserService.person;

import lombok.Data;

@Data
public class Person {
    private String regiNum;
    private String passNum;

    Person(String rNum, String pNum){
        regiNum = rNum;
        passNum = pNum;
    }
    Person(String rNum){
        regiNum = rNum;
    }

}
