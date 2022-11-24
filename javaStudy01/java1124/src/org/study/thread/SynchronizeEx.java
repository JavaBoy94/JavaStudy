package org.study.thread;

// 1. 공유자원 클래스 생성
class shareStorage {
	// 동기화가 선언된 공유자원 메소드
	synchronized void storagePrint(String str) {

		for (int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 2. 멀티스레드 클래스 생성  >> 동기화된 공유자원 접근
class Thread4 extends Thread {
	// 공유자원클래스 타입의 필드 생성 
	private shareStorage share;
	private String str;
	
	// 생성자 세팅 (해당 스레드 객체 생성시 바로 공유자원을 사용하도록)
	public Thread4(shareStorage share, String str) {
		super();
		this.share = share;
		this.str = str;
	}

	@Override
	public void run() {
		share.storagePrint(str);
//		shareStorage.   => 객체 단위로 락을 얻기 때문에, 클래스에서 바로 접근은 불가능
	}
}
public class SynchronizeEx {

	public static void main(String[] args) {
		shareStorage s1 = new shareStorage();
		shareStorage s2 = new shareStorage();
		String str1 = "abcdef";
		String str2 = "가나다라마바";
		
		new Thread4(new shareStorage(), str1).start();
		new Thread4(s2, str2).start();
	}
}
