package org.study.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingEx2 extends JFrame {
	
	public SwingEx2() {   // 기본생성자 설정 => 해당 객체생성시 자동으로 프레임(창)이 설정되고 실행
	
		setTitle("SwingEx2 타이틀");
		setSize(1280, 600);
		setVisible(true);
		
		// 프레임(창) 닫을때 동작 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // 메인프레임 종료시 모두 종료
		// 컨테이너 생성
		Container conPane = getContentPane();
		conPane.setBackground(Color.YELLOW);
		conPane.setLayout(new FlowLayout());   // 배치관리자 설정
		
		// 컨테이너에 컴포넌트 추가
		conPane.add(new JButton("OK"));
		conPane.add(new JButton("CANCEL"));
		conPane.add(new JButton("GO !"));
		
		
	}

	public static void main(String[] args) {
		
		// 자기자신의 클래스를 호출
		new SwingEx2();
		
	}
}
