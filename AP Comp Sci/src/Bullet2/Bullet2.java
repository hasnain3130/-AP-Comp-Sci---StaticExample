package Bullet2;

public class Bullet2 {
	private static int var1 = 10; 
	
	// Default constructor is called. It does not do anything since instance variables are initialized. 
	
	public static void setVar1() {
		var1 = 100;
	}
	
	public String toString() { // Instance method accessing static method and static variable. 
		setVar1();
		
		return "Var 1 is " + var1;
	}
}
