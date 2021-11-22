package com.hansol.internprac.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntDto {
    public String id;
    public String title;

    public EntDto(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
