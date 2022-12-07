package org.study.InterfaceEx;

public class InterfaceEx3SubMain {

	public static void main(String[] args) {
		
		// 익명객체 (상속과 객체생성을 한번에 처리)
//		new InterfaceEx3() {
//			
//			@Override
//			public void excuteQuery2() {
//				// TODO Auto-generated method stub
//				
//			}
//			
//			@Override
//			public void excuteQuery1() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		InterfaceEx3Sub inter1 = new InterfaceEx3Sub();
		inter1.excuteQuery1();
		inter1.excuteQuery2();
		int numMax = inter1.MAXNUM1;
		int numMax2 = inter1.MAXNUM2;
		String name = inter1.name;
		
		InterfaceEx3 inter2 = new InterfaceEx3Sub();
		inter2.excuteQuery1();
		inter2.excuteQuery2();
		int numMax3 = inter2.MAXNUM1;
		int numMax4 = inter2	.MAXNUM2;
	}
}
