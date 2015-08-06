package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;

public class SherlockDecentNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			StringBuilder sb = new StringBuilder();
			int digit = sc.nextInt();
			int count = (5*(2*digit%3));
			if(count > digit){
				System.out.println(-1);
			}else {
				for(int j=0;j<digit -count; j++){
					sb.append('5');
				}
				for(int j=0;j<count; j++){
					sb.append('3');
				}
				 
				System.out.println(sb);
			}
		}
		sc.close();
	}
}
