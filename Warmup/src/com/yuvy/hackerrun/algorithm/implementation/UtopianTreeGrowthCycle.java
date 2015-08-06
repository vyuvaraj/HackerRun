package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class UtopianTreeGrowthCycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int cycle = sc.nextInt();
			int growth=1;
			for(int j=0;j<cycle;j++){
				if(j%2==0){
					growth = growth *2;
				}else{
					growth = growth +1;
				}
			}
			System.out.println(growth);
		}
		sc.close();
	}
}
