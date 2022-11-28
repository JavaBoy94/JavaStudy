package org.study.gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenuEx extends JFrame {

	public JMenuEx() {
		super("JMenu 타이틀");  // super => jFrame 생성자 오버로딩 메소드 중 타이틀을 받는 메소드 선택 시 setTitle 불필요
		
		// JFrame > JMenuBar > JMenu > JMenuItem

		// 메뉴바 생성 (JMenu)
		JMenuBar menuBar = new JMenuBar();
		// 메뉴바 적용
		setJMenuBar(menuBar);
		
		// 메뉴 1. 파일 ------------------------------
		JMenu filemenu = new JMenu("파일(F)");
		// 메뉴1 단축키(F) 설정   => 단축키 앞에 Alt와 같이 입력
		filemenu.setMnemonic('F');
		
		// 메뉴 1의 하위메뉴(menuitem) 1) 새파일
		JMenuItem newfile = new JMenuItem("새파일(N)");
		newfile.setMnemonic('N');	
		// 메뉴 1의 하위메뉴(menuitem) 2) 열기
		JMenuItem open = new JMenuItem("열기(O)");
		open.setMnemonic('O');
		// 메뉴 1의 하위메뉴(menuitem) 3) 저장
		JMenuItem save = new JMenuItem("저장(S)");
		save.setMnemonic('S');	
		// 메뉴 1의 하위메뉴(menuitem) 4) 닫기
		JMenuItem close = new JMenuItem("닫기(C)");
		close.setMnemonic('C');
		
		// 메뉴1에 하위메뉴 추가
		filemenu.add(newfile);
		filemenu.add(open);
		filemenu.add(save);
		filemenu.add(close);
		
		// 메뉴 2. 도움말 -----------------------------
		JMenu helpmenu = new JMenu("도움말(D)");
		helpmenu.setMnemonic('D');
		
		// 메뉴 2의 하위메뉴(menuitem) 1) Help
		JMenuItem help = new JMenuItem("Help(H)");
		help.setMnemonic('H');
		
		// 메뉴2에 하위메뉴 추가
		helpmenu.add(help);
		
		// 메뉴바에 메뉴 1,2 추가
		menuBar.add(filemenu);
		menuBar.add(helpmenu);
		
		setSize(400, 200);
		setVisible(true);		
		
	}
	
	
	public static void main(String[] args) {
		
		JMenuEx J1 = new JMenuEx();
		J1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
