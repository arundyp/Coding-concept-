package com.intr;

public class Test implements A,B {

	@Override
	public void m() {
		
		B.super.m();
	}
	
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.m();
		
	}

}
