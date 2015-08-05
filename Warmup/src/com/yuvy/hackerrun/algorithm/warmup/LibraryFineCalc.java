package com.yuvy.hackerrun.algorithm.warmup;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class LibraryFineCalc {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		String actualDateStr = sc.nextLine();
		String expectedDateStr = sc.nextLine();
		
		Date actual = sdf.parse(actualDateStr);
		Date exp = sdf.parse(expectedDateStr);
		
		int compare = actual.compareTo(exp);
		int fine = 0;
		if(compare>0){//actuals is after expected date
			System.out.println("compare "+compare);
			if(actual.getYear()> exp.getYear()){
				fine = 10000;
			}else if(actual.getMonth() > exp.getMonth()){
				fine = 500 * (actual.getMonth() - exp.getMonth());
			}else{
				fine = 15 * (actual.getDate() - exp.getDate());
			}
		}
		System.out.println(fine);
		
		sc.close();
	}
}
