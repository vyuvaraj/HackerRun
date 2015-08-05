package com.yuvy.hackerrun.algorithm.warmup;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateAMPMConversion {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		String dateStr = sc.nextLine();
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssa");
		Date dt = sdf.parse(dateStr);
		sdf.applyPattern("HH:mm:ss");
		System.out.println(sdf.format(dt));

		sc.close();
	}
}
