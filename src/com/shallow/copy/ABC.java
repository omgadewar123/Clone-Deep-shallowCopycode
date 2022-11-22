package com.shallow.copy;
// shallow copy pro....
public class ABC {

	
	int i;
	int j;
	
	
	@Override
	public String toString() {
		return "ABC [i=" + i + ", j=" + j + "]";
	}
	
	public static void main(String[] args) {
		
		
		ABC obj = new ABC();
		
		obj.i=5;
		obj.j=6;
		
		ABC obj1 =obj;
		obj1.j=7;
		
		// that is shallow copy
		System.out.println("obj :"+ obj);// 5,6//but5,7
		System.out.println("obj1 :"+obj1);//5,7
	}
	
	
}
