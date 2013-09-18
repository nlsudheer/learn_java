/**
 * 
 */
package learnjava;

import java.io.*;

/**
 * @author lsudheer
 * http://www.javatpoint.com/operators-in-java
 * Using two variables //http://www.zacharyfox.com/blog/fibonacci-project/fibonacci-in-java
 * using 3 variables: //http://www.freejavaguide.com/javasource1.htm
 */
public class Fibonacci1 {

	public static void fib(int n) {
		long a,b=0,c=1;
		
		for(int i=0; i<=n; i++) {
			
			System.out.println("Fibonacci series for the iteration "+i+" is: "+c);
			
			a=b;
			b=c;
			c=a+b;
			
		}
		
	}
	
	public static void fib1(int n) {
		
		long a=0,b=1;
		
		for(int i=0; i <=n; i++) {
						
			a=a+b;
			b=a-b;
			System.out.println("Fibonacci series for the iteration "+i+" is: "+a);
		}
		
		
	}
	
	public static void main (String []args) {
		int N =0;
		String str;
		try {
			System.out.println("Enter the any digit to find it's Fibonacci series ");
			BufferedReader bfd = new BufferedReader (new InputStreamReader(System.in));
			str = bfd.readLine(); 
			N = Integer.valueOf(str).intValue();
			System.out.println("Enter the any digit to find it's Fibonacci series "+N);
		}catch (Exception e) {
			System.out.println("Catch exception "+e);
			
		}
		
		fib(N);
		fib1(N);
		System.out.println("Fiboncci series for the number "+ N +": " );
		
	}
}
