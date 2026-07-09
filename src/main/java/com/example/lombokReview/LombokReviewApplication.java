package com.example.lombokReview;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.lombokReview.Member;

@SpringBootApplication
public class LombokReviewApplication {
	public static void main(String[] args) {
		Admin a = new Admin(123, "123pw", "Emily", "emily@gmail.com", "BACKEND");
		System.out.println(a.toString());

		Admin b = new Admin(123, "123pw", "Emily", "emily@gmail.com", "BACKEND");
		System.out.println(b.toString());

		System.out.println("Equality test! - " + a.equals(b));
	}
}
