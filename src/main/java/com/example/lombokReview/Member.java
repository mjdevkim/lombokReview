package com.example.lombokReview;

import lombok.*;


@ToString(exclude = { "pw" })
@EqualsAndHashCode
@RequiredArgsConstructor
public class Member {
    @Getter(AccessLevel.PUBLIC) // == @Getter
    private final int id;

    private String pw;

    @Getter(AccessLevel.PROTECTED)
    @Setter
    private String name;

    @Getter
    @Setter
    private String email;
}
