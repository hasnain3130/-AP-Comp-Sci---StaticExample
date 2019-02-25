package Bullet3;

public class Bullet3 {
	private static int var = 100;
	
	public static int getVar()
	{
		return var; // Accessing class variable.
	}
	
	public static void printVar() {
		System.out.println(getVar()); // Accessing class method. 
	}
	
	public String toString() { // toString of object. 
		return "Var = " + var;
	}
}
