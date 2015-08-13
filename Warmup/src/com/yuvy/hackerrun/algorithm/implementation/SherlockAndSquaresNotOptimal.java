package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class SherlockAndSquaresNotOptimal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int cnt = 0;
			double startSqRt = Math.ceil(Math.sqrt(start));
			while(Math.pow(startSqRt, 2) <= end){
				cnt++;
				startSqRt+=1;
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}
