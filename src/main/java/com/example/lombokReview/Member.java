package com.example.lombokReview;

import lombok.*;


@ToString(exclude = { "pw" })
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
public class Member {
    @Getter
    private final int id;

    private String pw;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;
}
