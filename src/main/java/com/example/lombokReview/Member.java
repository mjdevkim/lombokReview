package com.example.lombokReview;

import lombok.*;


@ToString(exclude = { "pw" })
@AllArgsConstructor
@EqualsAndHashCode
public class Member {
    @Getter
    private int id;

    private String pw;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;
}
