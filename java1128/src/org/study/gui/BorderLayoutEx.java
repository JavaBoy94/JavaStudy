package org.study.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{

	public BorderLayoutEx() {
		setTitle("BorderLayout 타이틀");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 300);
		setVisible(true);
		
		Container conPane = getContentPane();
		conPane.setBackground(Color.BLUE);
		conPane.setLayout(new BorderLayout());   // 기본 배치관리자 : BorderLayout
	
		// BorderLayout 배치관리자 설정
		conPane.add(new JButton("BorderAPP"), BorderLayout.CENTER);
		conPane.add(new JButton("add"), BorderLayout.EAST);
		conPane.add(new JButton("sub"), BorderLayout.WEST);
		conPane.add(new JButton("mul"), BorderLayout.SOUTH);
		conPane.add(new JButton("div"), BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		
		new BorderLayoutEx();
		
	}
}
