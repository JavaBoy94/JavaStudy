package org.study.connect;

import java.sql.SQLException;
// 인터페이스로 throws 사용
public interface ExceptionEx9 {

	int NUM = 100;
	public abstract void excute() 
			throws ClassNotFoundException, SQLException;
}
