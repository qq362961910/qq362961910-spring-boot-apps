package com.jy.study.springcloud.serviceremote;

public class User {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            '}';
    }
}
