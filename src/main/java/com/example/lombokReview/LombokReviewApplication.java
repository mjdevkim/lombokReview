package com.example.lombokReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lombokReview.Member;

@SpringBootApplication
public class LombokReviewApplication {
	public static void main(String[] args) {
		Member m = new Member(1, "123pw","rachel", "rachel@email.com");
		System.out.println(m.toString());	// 따로 @ToString 설정 안하면 memory address 리턴한다

		Member m2 = new Member(1, "123pw", "rachel", "rachel@email.com");
		System.out.println(m2.toString());

		System.out.println(m.equals(m2));	// Member 클래스에 @EqualsAndHashCode가 안 붙어있으면 두 객체의 주소값만 비교하기 때문에 false라고 나온다.
	}

}
