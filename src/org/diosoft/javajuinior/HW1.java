/*
 * Java Junior Course
 * 
 * HW #1 14.08.2014
 * 
 * (c) Zamkovyi Alexander
 */

package org.diosoft.javajuinior;

public class HW1 {

	public static void main(String[] args) {
		int numberOfParameters = args.length;
		
		if (numberOfParameters > 0) System.out.print("List of input parameters: ");
		
		for (int i = 0; i < numberOfParameters; i++) {
			System.out.print(args[i]);
			if (i < numberOfParameters - 1) System.out.print(", ");
		}
		if (numberOfParameters > 0) System.out.println();
		
		System.out.print("Total number: ");
		System.out.println(numberOfParameters);	
	}
}
