package com.example.lombokReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lombokReview.Member;

@SpringBootApplication
public class LombokReviewApplication {
	public static void main(String[] args) {
		Member m = new Member(1);
		System.out.println(m.toString());

		Member m2 = new Member(1);
		System.out.println(m2.toString());

	}

}
