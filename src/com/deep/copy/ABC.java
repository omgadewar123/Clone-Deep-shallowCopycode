package com.deep.copy;
// Deep copy pro....
public class ABC {
	
	int i;
	int j;
	
	
	@Override
	public String toString() {
		return " [i=" + i + ", j=" + j + "]";
	}
	
	public static void main(String[] args) {
		
		ABC obj = new ABC();
		obj.i=5;
		obj.j=6;
		
		ABC obj1 = new ABC();
		
		obj1.i= obj.i;
		obj1.j= obj.j;
		
		obj1.j=8;
		
		System.out.println("obj "+ obj);
		
		System.out.println("obj1 "+obj1);
		
	}
	

}
