package com.hansol.internprac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@AllArgsConstructor
public class Ent {
    @Id
    public String id;

    public String title;

    public int price;

    public Ent(){

    }
}
