package org.study.Commend;

public class CRUDCommendMain {
	
	public static void main(String[] args) {
		
		CRUDCommend crud;
		
		crud = new DBInsert();
		crud.excuteCommend();
		
		crud = new DBDelete();
		crud.excuteCommend();
		
		crud = new DBUpdate();
		crud.excuteCommend();
		
		crud = new DBSelect();
		crud.excuteCommend();
	}
}
