package com.example.lombokReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lombokReview.Member;

@SpringBootApplication
public class LombokReviewApplication {
	public static void main(String[] args) {
		Member mem = Member.builder()
				.id(123)
				.name("MJ")
				.age(22)
				.email("mj@email.com")
				.build(); // 객체가 생성되는 시점

		System.out.println(mem.toString());
	}
}
