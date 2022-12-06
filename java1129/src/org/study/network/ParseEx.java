package org.study.network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseEx {

	public static void main(String[] args) {
		
		URL opinion = null;
		URL join = null;
		
		
		try {
			// 절대경로로 URL 객체 생성  => 예외처리 (MalformedURLException)
//			join = new URL("http://localhost:8092/springMVC1206/join");
			join = new URL("http://192.168.23.211:8092/springMVC1206/join");
			// 상대경로로 URL 객체 생성
			opinion = new URL(join, "join");
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("잘못된 URL입니다!");
		} 
		
		System.out.println("Protocol => "+opinion.getProtocol());
		System.out.println("Host => "+opinion.getHost());
		System.out.println("Port => "+opinion.getPort());
		System.out.println("Path => "+opinion.getPath());
		System.out.println("Filename => "+opinion.getFile());
	}
}
