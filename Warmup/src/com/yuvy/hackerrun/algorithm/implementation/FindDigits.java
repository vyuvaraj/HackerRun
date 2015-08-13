package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			int val = num;
			int cnt = 0;
			while (val != 0) {
				int digit = val % 10;
				if (digit != 0 && (num % digit == 0)) {
					cnt++;
				}
				val = val / 10;
			}
			System.out.println(cnt);

		}
		sc.close();
	}
}
