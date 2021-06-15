package com.fichajes.clockinontime.entity;

import com.fasterxml.jackson.annotation.JsonFormat;


@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Role {
    ADMIN("ADMIN"),
    USER("USER"),
    ALL("ALL");

    public final String name;

    Role(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }
}
