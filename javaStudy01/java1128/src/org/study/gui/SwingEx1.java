package org.study.gui;

import java.awt.Color;

import javax.swing.JFrame;
// JFrame 상속
public class SwingEx1 extends JFrame {
	// 생성자 세팅
	public SwingEx1() {
		// 타이틀 설정
		setTitle("SwingEx1 타이틀");
		// 사이즈 설정
		setSize(400, 200);
		// 노출여부 설정
		setVisible(true);
		// 색(배경색) 설정
		setBackground(Color.GREEN);
	}
	
	public static void main(String[] args) {
		
		new SwingEx1();
		
	}
}
