package com.example.lombokReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lombokReview.Member;

@SpringBootApplication
public class LombokReviewApplication {
	public static void main(String[] args) {
		Member m = new Member(1, "123pw","rachel", "rachel@email.com");
		m.setName("rachelle");
		m.setEmail("rachelle@email.com");
		System.out.println(m.toString());	// 따로 @ToString 설정 안하면 memory address 리턴한다

		Member m2 = new Member(1, "1234pw", "emily", "emily@email.com");
		System.out.println(m2.toString());

	}

}
