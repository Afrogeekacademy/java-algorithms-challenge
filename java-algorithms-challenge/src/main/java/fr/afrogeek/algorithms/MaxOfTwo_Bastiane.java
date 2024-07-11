package fr.afrogeek.algorithms;

public class MaxOfTwo_Bastiane {

	private static int result;


	public static void main(String[] args) {
		
    setResult(maxOfTwoNumbers(2,3));

		
	}
	
	
	public static int maxOfTwoNumbers(int a, int b) {
		
		if (a > b) {
			return a;
		}
		
		else {
			return b;
		}
		
	}


	public static int getResult() {
		return result;
	}


	public static void setResult(int result) {
		MaxOfTwo_Bastiane.result = result;
	}

}
