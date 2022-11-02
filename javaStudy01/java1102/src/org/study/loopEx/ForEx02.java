package org.study.loopEx;

import java.util.Scanner;

public class ForEx02 {

	public static void main(String[] args) {
		
		System.out.println("==이중for문==");
		
		System.out.println("구구단 (Asc)");
		
		for (int i=2; i<10; i++) {
			System.out.println("=="+i+"단==");
			for (int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		System.out.println("구구단 (Dsc)");
		
		for (int i=9; i>=2; i--) {
			System.out.println("=="+i+"단==");
			for (int j=1; j<10; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
		}
		
		
	}
}
