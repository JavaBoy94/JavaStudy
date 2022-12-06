package org.study.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Jmenu2 extends JFrame implements ActionListener{
	
	// Frame > Panel > MenuBar > Menu > MenuItem
	JMenuBar JMB;
	JMenu JM1, JM2;
	JMenuItem JMI1, JMI2, JMI3, exit;
	JPanel JP;   // => 그룹화 단위
	
	// 기본생성자 설정  => 해당 객체 생성시 자동 실행
	public Jmenu2() {
		super("타이틀");
		// 메뉴바 생성
		JMenuBar JMB = new JMenuBar();
		this.setJMenuBar(JMB);
		setSize(400, 300);
		setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JM1 = new JMenu("파일(F)");
		JM1.setMnemonic('F');  // 파일(F) 단축키 : alt + F
		JM2 = new JMenu("도움말(H)");
		JM2.setMnemonic('H');  // 도움말(H) 단축키 : alt + H
		
		JMI1 = new JMenuItem("메뉴1(E)");
		JMI1.setMnemonic('E');
		JMI2 = new JMenuItem("새 창(N)");
		JMI2.setMnemonic('N');
		JMI3 = new JMenuItem("메뉴3(3)");
		JMI3.setMnemonic('3');
		exit = new JMenuItem("닫기(C)");
		exit.setMnemonic('C');
		
		JM1.add(JMI1);
		JM1.add(JMI2);
		JM1.add(JMI3);
		JM2.add(exit);
		
		JMB.add(JM1);
		JMB.add(JM2);
		
		// 이벤트리스너 삽입
		JMI1.addActionListener(this);
		JMI2.addActionListener(this);
		exit.addActionListener(this);
		
	}
	// 액션이벤트 리스너(this) 구현  => 하나의 이벤트 메소드로 각각 다른 작업을 동시에 구현할 경우 => ★★조건문 사용!!
	@Override
	public void actionPerformed(ActionEvent e) {
		// 조건문
		if (e.getSource() == JMI1) {           // 이벤트가 발생된 소스(객체)가 JMI1일때 
			System.out.println("메뉴1 선택");
			
		} else if (e.getSource() == JMI2) {    // 이벤트가 발생된 소스(객체)가 JMI2일때
			System.out.println("새 창 선택");
			// 새창 띄우는 메소드 생성
			newWindow();
			
		} else if (e.getSource() == exit) {    // 이벤트가 발생된 소스(객체)가 exit일때
			System.out.println("종료합니다!");
			System.exit(0);   // 현재 실행중인 JVM(프로그램)을 종료. 변수는 상태코드(0: 정상종료)
		}
		
		
	}
	
	
	private void newWindow() {
		// 다이얼로그,패널, 버튼 생성
		Button btn = new Button("Close");
		btn.setSize(100, 100);
		JP = new JPanel();
		JP.setBackground(Color.CYAN);
		Dialog dial = new Dialog(this, "새창 열기");
		dial.setBackground(Color.CYAN);
		dial.setSize(300, 200);
		dial.setVisible(true);
		dial.setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));  // 중앙정렬, 수평간격 200, 수직간격 100
		// 패널에 버튼 삽입
		JP.add(btn);
		// 다이얼로그에 패널 삽입
		dial.add(JP);
		
		// btn에 액션이벤트 삽입 (다이얼로그 닫기) => 익명클래스 구현 => 람다식으로
		btn.addActionListener((ActionEvent e)->{
			System.out.println("다이얼로그 종료!");
			dial.setVisible(false);
		});
		
		// btn에 마우스이벤트 삽입 (누르고 있을때 색 변경)
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				e.getSource();
				btn.setBackground(Color.RED);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	public static void main(String[] args) {
		
		new Jmenu2();
		
	}

	
}
