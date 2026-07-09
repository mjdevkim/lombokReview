package com.example.sandbox;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class sandboxApplication {
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>(Arrays.asList(1,2,3));
		intSet.add(4);
		intSet.remove(3);
		intSet.contains(2);
		intSet.contains(6);
		intSet.clear();
		intSet.isEmpty();
		intSet.size();
	}
}
