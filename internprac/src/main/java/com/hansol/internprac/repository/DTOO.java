package com.hansol.internprac.repository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DTOO {
    public String id;
    public String title;

    public DTOO(String id, String title) {
        this.id = id;
        this.title = title;
    }
}
