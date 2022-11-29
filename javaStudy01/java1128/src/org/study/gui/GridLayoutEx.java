package org.study.gui;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutEx extends JFrame {

	public GridLayoutEx() {
		setTitle("GridLayout 타이틀");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 그리드 배치관리자 객체 생성 (4X2)
		GridLayout grid = new GridLayout(4, 2);  //4행 2열
		// 그리드 사이 수직(세로)간격 설정
		grid.setVgap(5);
		setLayout(grid);   // grid를 기본 배치관리자로 설정
	
		add(new JLabel(" 이름"));
		add(new JTextField("")); // 입력받는 부분		
		add(new JLabel(" 학번"));
		add(new JTextField("")); // 입력받는 부분	
		add(new JLabel(" 학과"));
		add(new JTextField("")); // 입력받는 부분	
		add(new JLabel(" 과목"));
		add(new JTextField("")); // 입력받는 부분
		
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new GridLayoutEx();
	}
}
