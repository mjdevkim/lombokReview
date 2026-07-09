package com.example.lombokReview;

import lombok.*;

import java.time.LocalDate;

public class Admin extends Member {
    @Getter
    private String role;

    private LocalDate allocatedAt;

    public Admin(int id, int age, String name, String email, String role) {
        super(id, age, name, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    public String toString() {
        return String.format(
                "Admin(id=%s, name=%s, age=%s, email=%s, role=%s, allocatedAt=%s)",
                this.getId(), this.getName(), this.getAge(), this.getEmail(), this.role, this.allocatedAt
        );
    }
}
