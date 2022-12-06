package org.study.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsolutePaneEx extends JFrame {
	
	public AbsolutePaneEx() {
		
		this.setTitle("AbsolutePane 타이틀");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 생성  => (프레임 > 패널 > 컴포넌트) 패널에 컴포넌트를 붙인다음, 프레임에 부착
		JPanel panel = new JPanel();
		// 기본 배치관리자 미설정 => 절대위치 사용
		panel.setLayout(null);   
		// 컴포넌트 생성
		JButton btn1 = new JButton("btn1");
		JButton btn2 = new JButton("btn2");
		JButton btn3 = new JButton("btn3");
		JButton btn4 = new JButton("btn4");
		// 버튼 크기 설정
		btn1.setSize(150, 50);
		btn2.setSize(150, 50);
		btn3.setSize(150, 50);
		btn4.setSize(150, 50);
		// 버튼 위치 설정 (프레임 정 가운데에 위치)
		btn1.setLocation(0,0);
		btn2.setLocation(450,0);
		btn3.setLocation(0,550);
		btn4.setLocation(450,550);
		// 버튼 색상 설정
		btn1.setBackground(Color.RED);
		btn2.setBackground(Color.BLUE);
		btn3.setBackground(Color.YELLOW);
		btn4.setBackground(Color.GREEN);
		// 패널에 컴포넌트 삽입
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		
		// 패널을 프레임에 부착 (Object, JFrame)
		this.add(panel);
		this.setSize(600, 600);
		this.setBackground(Color.GREEN);
		this.setVisible(true);
		

	}

	public static void main(String[] args) {
		
		new AbsolutePaneEx();
		
	}
}
