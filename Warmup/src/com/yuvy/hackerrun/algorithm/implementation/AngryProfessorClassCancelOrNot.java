package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class AngryProfessorClassCancelOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int tot = sc.nextInt();
			int act = sc.nextInt();
			int yes = 0;
			for (int j = 0; j < tot; j++) {
				int people = sc.nextInt();
				if (people <= 0) {
					yes++;
				}
			}
			if (yes < act) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}
}
