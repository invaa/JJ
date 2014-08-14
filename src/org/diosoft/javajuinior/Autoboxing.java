package org.diosoft.javajuinior;

public class Autoboxing {

	static Integer add(Integer i, Integer j) {
		System.out.print("add(Integer, Integer): ");
		return i + j;
	}
	
	static Integer add(Integer i, int j) {
		System.out.print("add(Integer, int): ");
		return i + j;
	}
	
	static Integer add(int i, Integer j) {
		System.out.print("add(int, Integer): ");
		return i + j;
	}
	
	static Integer add(int i, int j) {
		System.out.print("add(int, int): ");
		return i + j;
	}
	
	static Integer add(int ...i) {
		System.out.print("add(Integer ...i): ");	
		int res = 0;
		
		for (int index = 0; index < i.length; index++) {
			res+=i[index];
		}
		return res;
	}
	
	static Integer add(Integer ...i) {
		System.out.print("add(int ...i): ");
		int res = 0;
		
		for (int index = 0; index < i.length; index++) {
			res+=i[index];
		}
		return res;
	}
	
	public static void main(String[] args) {
	
		System.out.print("adding: ");
		System.out.println(add(1,2));
		
		int a = 3, b = 4;
		
		System.out.print("adding: ");
		System.out.println(add(a,b));
		
		int i = 1;
		
			int g = 1; 
	        int h = g++; 
	        int c = -g; 
	        System.out.print(g); 
	        System.out.print(h); 
	        System.out.print(c); 
		

	}

}
