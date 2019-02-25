package Bullet1;

public class Bullet1 {
	private int var1; 
	
	public Bullet1 (int variable1) {
		var1 = variable1; // It is good practice to use the this keyword when coding objects. It should be
						  // this.var1 = variable1 but this works too. 
	}
	
	public int getVar1() {
		return var1; // Accessing instance variable var1. 
	}
	
	public int var1AddTen() {
		return getVar1() + 10; // Accessing instance method getVar1()
	}
	
	public String toString() { // toString method. Instance method is accessing instance variable and method. 
		return " getVar1() method is " + getVar1() + "\n var1AddTen() method is " + var1AddTen() + "\n var1 instance variable is " + var1;
	}
}
