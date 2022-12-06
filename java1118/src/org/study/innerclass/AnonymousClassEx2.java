package org.study.innerclass;

interface i1 {
	abstract void i1(); 
}

interface i2 extends i1 {
	abstract void i2();
}

interface i3 extends i2 {
	abstract void i3();
}




public class AnonymousClassEx2 {

	public static void main(String[] args) {
		
		new i1() {
			
			@Override
			public void i1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		new i3() {
			
			@Override
			public void i1() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void i2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void i3() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
}
