package org.study.jdbc;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



class User {
	private String userId;
	private String userPw;
	private int age;
	
	
	public User(String userId, String userPw, int age) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}




public class Test1202 {

	public static void main(String[] args) {
		
		// User(사용자정의타입)타입의 ArrayList 생성
		ArrayList<User> users = new ArrayList<>();
		
		// 객체타입 요소 추가 => 매개변수에 new 객체 생성 (기본생성자)
		users.add(new User("m1", "111", 10));
		users.add(new User("m2", "222", 20));
		users.add(new User("m3", "333", 30));
		users.add(new User("m4", "444", 40));
		users.add(new User("m5", "555", 50));
		
		// 객체타입 요소 출력 => foreach
		System.out.println("userID\tuserPW\tAge");
		System.out.println("-----------------------");
		for (User user : users) {
			System.out.println(user.getUserId()+"\t"+user.getUserPw()+"\t"+user.getAge());
		}
		
		System.out.println();
		
		
		// iterator사용
		System.out.println("userID\tuserPW\tAge");
		System.out.println("-----------------------");
		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			User user = iter.next();
			System.out.println(user.getUserId()+"\t"+user.getUserPw()+"\t"+user.getAge());
		}
		
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 컬렉션
		List<Integer> lists = new ArrayList<>();
		ArrayList<Integer> lists2 = new ArrayList<>();
		
		// 리스트 요소 추가
		lists.add(10);
		lists.add(20);
		lists.add(30);
		lists.add(40);
		lists.add(50);
		
		// 리스트 요소 출력
		System.out.println(lists.get(0));
		System.out.println(lists.get(1));
		System.out.println(lists.get(2));
		System.out.println(lists.get(3));
		System.out.println(lists.get(4));
		
		System.out.println();
		
		// for문 출력
		for (int i=0; i<lists.size(); i++) {
			System.out.println(lists.get(i));
		}
		
		System.out.println();
		
		
		// foreach문 출력
		for (Integer in : lists) {
			System.out.println(in);
		}
		
	
	}
}
