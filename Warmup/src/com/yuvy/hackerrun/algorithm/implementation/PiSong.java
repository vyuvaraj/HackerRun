package com.yuvy.hackerrun.algorithm.implementation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PiSong {
	static final String PI = "31415926535897932384626433833";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < t; i++) {
			String line = sc.nextLine();
			StringBuilder sb = new StringBuilder();
			Pattern p = Pattern.compile("(\\w+)");
			Matcher m = p.matcher(line);
			while (m.find()) {
				sb.append(m.group(0).length());
			}
			String fromPi = PI.substring(0,sb.length());
			if(fromPi.equals(sb.toString())){
				System.out.println("It's a pi song.");
			}else {
				System.out.println("It's not a pi song.");
			}
		}
		sc.close();
	}
}
