package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class SherlockAndSquaresApproachTwo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int cnt = 0;
			for (int j = start; j <= end; j++) {
				if(Math.sqrt(j) %1 == 0){
					cnt++;
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
