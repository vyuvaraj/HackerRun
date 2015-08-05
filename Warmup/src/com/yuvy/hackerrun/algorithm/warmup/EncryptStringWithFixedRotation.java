package com.yuvy.hackerrun.algorithm.warmup;
import java.util.Scanner;

public class EncryptStringWithFixedRotation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nChar = sc.nextInt();
		String line = sc.next();
		int jump = sc.nextInt();
		if (jump > 26) {
			jump = jump % 26;
		}
		char[] arr = new char[line.length()];
		for (int i = 0; i < line.length(); i++) {
			int asciVal = line.charAt(i);
			if (asciVal >= 65 && asciVal <= 90) {
				int tobeJumped = asciVal + jump;
				if ((tobeJumped) > 90) {
					asciVal = 65 + (tobeJumped - 91);
				} else {
					asciVal = tobeJumped;
				}
			} else if (asciVal >= 97 && asciVal <= 122) {
				int tobeJumped = asciVal + jump;
				if ((tobeJumped) > 122) {
					asciVal = 97 + (tobeJumped - 123);
				} else {
					asciVal = tobeJumped;
				}
			}
			System.out.println(asciVal);
			arr[i] = (char) asciVal;
		}
		System.out.println(arr);
		sc.close();
	}
}
