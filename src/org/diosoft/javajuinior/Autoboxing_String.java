package org.diosoft.javajuinior;

public class Autoboxing_String {

	static int foo(Integer i, int j) {
		System.out.print("foo(Integer, int): ");
		return i;
	}
	
	static int foo(int i, int j) {
		System.out.print("foo(int, int): ");
		return i;
	}
	
	static int foo(int ...i) {
		System.out.print("foo(int): ");
		return 0;
	}
	
	static int foo2(int i, Integer j) {
		System.out.print("foo2(int, Integer): ");
		return i;
	}
	
	static Integer foo2(int i, int j) {
		System.out.print("foo2(int, int): ");
		return i;
	}
	
	static String add(Integer i, String j) {
		System.out.print("add(Integer, String): ");
		return i + j;
	}
	
	static String add(int i, String j) {
		System.out.print("add(int, String): ");
		return i + j;
	}
	
	public static void main(String[] args) {
	
		System.out.print("adding: ");
		System.out.println(add(1,"2"));
		
		System.out.print("foo: ");
		System.out.println(foo(1,2));
		
	}

}
