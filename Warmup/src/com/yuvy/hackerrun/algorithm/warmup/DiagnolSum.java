package com.yuvy.hackerrun.algorithm.warmup;
import java.util.Scanner;

public class DiagnolSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[][] arr = new int[t][t];
		int firstDiag = 0;
		int secDiag = 0;
		for (int i = 0; i < t; i++) {
			for (int j = 0; j < t; j++) {
				arr[i][j] = sc.nextInt();
				if(i==j){
					firstDiag+=arr[i][j];
				}
			}
		}
		for(int i=0;i<t;i++){
			for(int j=t-1;j>=0;j--,i++){
				secDiag+=arr[i][j];
			}
		}
		System.out.println(Math.abs(firstDiag-secDiag));
		sc.close();
	}
}
