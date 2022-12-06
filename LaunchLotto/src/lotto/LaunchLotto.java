package lotto;

import java.util.ArrayList;
import java.util.Random;

public class LaunchLotto {

	public static void main(String[] args) {
		
		System.out.println("===점심메뉴 뽑기===");
		
		ArrayList<String> menu = new ArrayList<String>();
		
		menu.add("국밥");
		menu.add("중식");
		menu.add("햄버거");
		menu.add("백반");
		menu.add("쌀국수");
		menu.add("라멘");
		menu.add("분식");
		
		int i = (int) (Math.random()*(menu.size()+1));
		
		System.out.println("오늘 점심 메뉴는... "+menu.get(i)+" !");
	}
}
