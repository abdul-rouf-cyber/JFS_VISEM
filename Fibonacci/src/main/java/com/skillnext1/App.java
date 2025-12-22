package com.skillnext1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
		int fib1=0;
		int fib2=1;
		System.out.println(fib1);
		System.out.println(fib2);
		int n=5;
		int i=0;
		while(i<n){
			int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			i++;
			System.out.println(fib3);
		
		}
    }
}
