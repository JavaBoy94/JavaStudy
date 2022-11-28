package org.study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JDialogEx extends JFrame implements ActionListener{
	
	JMenuBar jmb;
	JMenu jm;
	JMenuItem jmi1, jmi2;
	Button btn;

	public JDialogEx() {
		super("JDialogEx 타이틀");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT));
		
		jmb = new JMenuBar();
		jm = new JMenu("메뉴");
		jmi1 = new JMenuItem("메뉴1");
		jmi2 = new JMenuItem("메뉴2");
		btn = new Button("BUTTON");
		
		jm.add(jmi1);
		jm.add(jmi2);
		jmb.add(jm);
		this.add(jmb);
		
		this.setSize(500, 400);
		this.setVisible(true);
		
		// jmi1에 액션이벤트 추가
		jmi1.addActionListener(this);
	}
	
	
	@Override    // 액션이벤트 설정
	public void actionPerformed(ActionEvent e) {
		// 다이얼로그 생성
		JDialog dial = new JDialog(this, "다이얼로그");  // this => 다이얼로그 오너(JDialogEx)
		dial.setSize(300,200);
		dial.setVisible(true);
		// 다이얼로그 배치관리자 설정
		dial.setLayout(new FlowLayout(FlowLayout.CENTER,100,120));
		// 버튼 사이즈
		btn.setSize(100,100);
		// 다이얼로그에 버튼 추가
		dial.add(btn);
		
		// 버튼에 액션이벤트 추가
		btn.addActionListener(new ActionListener() {
			
			@Override    // 버튼에 대한 액션이벤트 설정
			public void actionPerformed(ActionEvent e) {
				dial.setVisible(false);  // 버튼 클릭시 다이얼로그를 없애는 액션이벤트
			}
		});
		
		
	}
	
	public static void main(String[] args) {
		new JDialogEx();
	}
}
