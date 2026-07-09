package com.example.lombokReview;

import lombok.*;

@ToString(exclude = { "pw" })
    // Variation:
        // @ToString(of = {"id", "email"})
        // @ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
@AllArgsConstructor
public class Member {
//    @ToString.Include
    @Getter(AccessLevel.PUBLIC) // == @Getter
    protected final int id;

    private String pw;

//    @ToString.Include
    @Getter(AccessLevel.PROTECTED)
    @Setter
    protected String name;

//    @ToString.Include
    @Getter
    @Setter
    protected String email;
}
