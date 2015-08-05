package com.yuvy.hackerrun.algorithm.warmup;
import java.util.Scanner;

public class PrintStairCaseWithHash {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int steps = sc.nextInt();
		for (int i = 0; i < steps; i++) {
			int space = steps - i - 1;

			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = space; j < steps; j++) {
				if (j == steps - 1) {
					System.out.println("#");
				} else {
					System.out.print("#");

				}

			}
		}
		sc.close();
	}
}
