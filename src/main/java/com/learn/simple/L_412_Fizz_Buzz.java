package com.learn.simple;

import java.util.ArrayList;
import java.util.List;

public class L_412_Fizz_Buzz {

	public static void main(String[] args) {
		L_412_Fizz_Buzz l = new L_412_Fizz_Buzz();
		l.fizzBuzz(15);
	}

	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList();
		int i = 1;
		while (i <= n) {
			if (i % 15 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");
			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add(i + "");
			}
			i++;
		}
		return list;
	}

}
