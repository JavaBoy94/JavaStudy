package org.study.gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

// MouseListener 인터페이스 구현 => 오버라이딩 필수
// 마우스 관련 이벤트 발생시 동작을 처리하는 리스너
class MyMouseListener implements MouseListener {

	// MouseEvent e => 실제 이벤트가 적용되는 대상
	
	@Override    // ★★마우스를 눌렀다 뗐을때  => 누를때, 뗐을때 모두 포함
	public void mouseClicked(MouseEvent e) {  
		// 마우스가 올라간 버튼의 주소를 알아냄
		JButton btn = (JButton) e.getSource();
		// 마우스가 버튼 위로 올라갈 때 버튼의 색상 변경
		btn.setBackground(Color.GREEN);
	}

	@Override    // 마우스를 누르고 있을때
	public void mousePressed(MouseEvent e) {   
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.BLACK);
	}

	@Override    // 눌러진 마우스를 뗐을 때   => mouseClicked과 비슷하지만 mouseClicked이 우선됨
	public void mouseReleased(MouseEvent e) {   
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.PINK);
	}

	@Override    // 마우스가 버튼 위에 올라와 있을 때 호출
	public void mouseEntered(MouseEvent e) { 
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.RED);
	}

	@Override    // 마우스가 버튼에서 내려갈 때 호출
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	
}

public class ListenerMouseEx extends JFrame {

	public ListenerMouseEx() {
		this.setTitle("버튼에 Mouse 이벤트 리스너 작성");
		this.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 버튼 컴포넌트 생성 후 마우스 리스너 부착(적용)
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.GREEN);
		// 마우스 리스너 객체 생성
		MyMouseListener listener = new MyMouseListener();
		// 버튼에 마우스리스너 추가(부착)
		btn.addMouseListener(listener);  
		
		this.add(btn);
		this.setSize(300, 150);
		this.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		
		new ListenerMouseEx();
		
	}
}
