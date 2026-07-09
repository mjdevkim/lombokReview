package com.example.lombokReview;

import lombok.*;

@ToString(exclude = { "pw" })
    // Variation:
        // @ToString(of = {"id", "email"})
        // @ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode
//  @EqualsAndHashCode(exclude = { "email" })
@AllArgsConstructor
public class Member {
//    @ToString.Include
    @Getter(AccessLevel.PUBLIC) // == @Getter
    protected final int id;

    private String pw;

//    @ToString.Include
    @Getter(AccessLevel.PROTECTED)
    @Setter
    // @EqualsAndHashCode.Exclude -> 동등성 비교에서 제외할 필드라고 표시
    protected String name;

//    @ToString.Include
    @Getter
    @Setter
    protected String email;
}
