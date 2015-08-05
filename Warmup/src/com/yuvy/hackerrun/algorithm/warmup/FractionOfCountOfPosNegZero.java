package com.yuvy.hackerrun.algorithm.warmup;
import java.util.Scanner;

public class FractionOfCountOfPosNegZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		float pos = 0;
		float neg = 0;
		float zer = 0;

		for (int i = 0; i < t; i++) {
			int val = sc.nextInt();
			if(val<0){
				neg++;
			}else if(val>0){
				pos++;
			}else{
				zer++;
			}
		}
		float posf = pos/t;
		float negf = neg/t;
		float zerf = zer/t;
		System.out.printf("%.3f\n",posf);
		System.out.printf("%.3f\n",negf);
		System.out.printf("%.3f\n",zerf);
		sc.close();
	}
}
