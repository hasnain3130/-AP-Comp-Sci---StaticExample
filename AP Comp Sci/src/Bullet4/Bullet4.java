package Bullet4;

public class Bullet4 {
	private int var;
	
	public Bullet4 (int variable4) {
		var = variable4;
	}
	
	public static int letMeIn() {
		// var = 100;  Cannot access that! Must declare an object reference of itself. Will result in an error. 
		
		// Below is an alternative to fix that error. You must use object references. 
		
		Bullet4 b4 = new Bullet4(10);
		
		b4.var = 100;
		
		return b4.var;
	}
	
	public String toString() {
		return "Var = " + var + " | b4.var = " + letMeIn();
	}
}
