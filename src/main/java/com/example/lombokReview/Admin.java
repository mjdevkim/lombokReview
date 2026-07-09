package com.example.lombokReview;

import lombok.*;

import java.time.LocalDate;

@ToString(callSuper = true)
public class Admin extends Member {
    private String role;
    private LocalDate allocatedAt;

    public Admin(int id, String name, String pw, String email, String role) {
        super(id, pw, name, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }
}
