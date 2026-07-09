package com.example.lombokReview;

import lombok.*;

@Getter
@Builder    // 클래스 전체에 Builder 정의
@ToString
public class Member {
    private int id;
    private int age;
    private String name;
    private String email;

    static class MemberBuilder {
        public MemberBuilder age(int age) {
            if (age < 20) {
                throw new RuntimeException("미성년자는 가입할 수 없습니다: " + age);
            }
            this.age = age;
            return this;
        }
    }
}
