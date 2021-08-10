package net.zerotodev.api.UserService.inheritance;

import lombok.Data;

import javax.persistence.Id;

@Data
public class ItemDto {
    @Id
    private long itemId;
}
