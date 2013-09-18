package learnjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;




public class Fibonacci{
	
	
	public static void main(String[] args) {
        String.class.getClass().getMethods(); // var = "12";
		try {
		BufferedReader bfd = new BufferedReader(new InputStreamReader(System.in));
		String str = bfd.readLine();
		}catch (Exception e) {
			System.out.println("Exception while reading input");
		}
	}
}



/*


*//*************************************************************************
 *  Compilation:  javac Fibonacci.java
 *  Execution:    java Fibonacci N
 *
 *  Computes and prints the first N Fibonacci numbers.
 *
 *  WARNING:  this program is spectacularly inefficient and is meant
 *            to illustrate a performance bug, e.g., set N = 45.
 *
 *
 *   % java Fibonacci 7
 *   1: 1
 *   2: 1
 *   3: 2
 *   4: 3
 *   5: 5
 *   6: 8
 *   7: 13
 *
 *   Remarks
 *   -------
 *    - The 93rd Fibonacci number would overflow a long, but this
 *      will take so long to compute with this function that we
 *      don't bother to check for overflow.
 *  //http://www.cs.princeton.edu/introcs/23recursion/Fibonacci.java.html
 *************************************************************************//*

public class Fibonacci {
	
	public static long fib(int n) {
		
		if(n<=1) return n;
		else return fib(n-1) + fib(n-2);
		
	}
	
	public static void main(String []args) {
		
		int N = Integer.parseInt(args[0]);
		
		for (int i=1;i<= N;i++) {
			
			System.out.println("Fibonacci value for the iteration "+i+": "+ fib(i));
			
		}
		
	}

}


*/