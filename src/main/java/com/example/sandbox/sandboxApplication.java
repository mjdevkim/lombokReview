package com.example.sandbox;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class sandboxApplication {
	public static void main(String[] args) {
		List<Integer> intArr = Arrays.asList(1, 2, 3); // 고정 길이 List
		List<String> strList = new ArrayList<>();
		strList.add("Geeks");
		strList.add("for");
		strList.add("Geeks");

		List<Integer> intList = new ArrayList<>();
		intList.add(3);
		System.out.println(intList.get(0));	// input: index
		intList.set(0, 89); // .set(index, element)
		intList.remove(0);

		intList.add(23);
		intList.add(1230);
		intList.add(899);

		List<Integer> subIntList = intList.subList(0, 1);
		System.out.println(subIntList);

		intList.sort(Collections.reverseOrder()); // ascending
		System.out.println(intList);

		intList.sort(Integer::compareTo);
		System.out.println(intList);
	}
}
