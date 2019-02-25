package Bullet5;

public class Bullet5 {
	private int var1;
	private static int var2 = 10; 
	
	public Bullet5 (int variable1) {
		var1 = variable1;
	}
	
	public static int getVar1PlusVar2(int var1Value) { // Method is unused. Only for the sake of example.
		// return this.var1 + var2; Is an error. Cannot access var1 using this.
		// return var1 + var2; Also returns an error. 
		
		Bullet5 b5 = new Bullet5(var1Value);
		
		return b5.var1 + var2;
	}
	
	public String toString() { // Instance method. 
		// No point really having a toString(). You will have to test the errors above on your own. You cannot
		// use this when referring to class (static) variables. You must create a reference to it. 
		
		return "Var 1 + Var2 " + this.var1 + var2;
	}
	
	
}
