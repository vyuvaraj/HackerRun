package com.yuvy.hackerrun.algorithm.warmup;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWords {
	Map<String, Integer> countMap = new TreeMap<String, Integer>();

	public void test(String line) {
		Pattern p = Pattern.compile("(\\w+)");
		Matcher m = p.matcher(line);
		while (m.find()) {
			String key = m.group(0).toLowerCase();
			Integer count = countMap.get(key);
			if (count == null) {
				count = 0;
			}
			count++;
			countMap.put(key, count);
		}
	}

	public void print() {
		Iterator<String> iterKey = countMap.keySet().iterator();
		while (iterKey.hasNext()) {
			String key = iterKey.next();
			System.out.println(key + " - " + countMap.get(key));
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//String para = "Testing the test is a difficult$ (sdf) test.";
		String para = in.nextLine();
		CountWords tc = new CountWords();
		tc.test(para);
		tc.print();
		in.close();
	}
}
