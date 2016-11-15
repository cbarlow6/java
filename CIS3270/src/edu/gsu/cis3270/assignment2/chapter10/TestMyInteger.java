package edu.gsu.cis3270.assignment2.chapter10;
//import java.util.Scanner;

public class TestMyInteger {

	public static void main(String [] args){
		MyInteger m = new MyInteger(7);
		
		if(m.isEven())
			System.out.println("- Value is even");
		if(m.isOdd())
			System.out.println("- Value is odd");
		if(m.isPrime())
			System.out.println("- Value is prime");
		
		if(MyInteger.isEven(8))
			System.out.println("- Value is even");
		if(MyInteger.isOdd(8))
			System.out.println("- Value is odd");
		if(MyInteger.isPrime(8))
			System.out.println("- Value is prime");
		
		
		if(MyInteger.isEven(new MyInteger(5)))
			System.out.println("- Value is even");
		if(MyInteger.isOdd(new MyInteger(5)))
			System.out.println("- Value is odd");
		if(MyInteger.isPrime(new MyInteger(5)))
			System.out.println("- Value is prime");
	
		if(m.equals(7)){
			System.out.println("- Values are equal");
		}
		else
			System.out.println("- Values are not equal");
		
		if(m.equals(new MyInteger (8))){
			System.out.println("- Values are equal");
		}
		else
			System.out.println("- Values are not equal");
		
		char[] chars = new char[]{'1', '2', '3'};
		System.out.println(MyInteger.parseInt(chars));
		
		System.out.println(MyInteger.parseInt("10"));
	}
}

class MyInteger{
	int value;
	
	MyInteger(int value){
	this.value = value;	
		
	}
	
	public int getValue(){
		return value;
	}
	
	public boolean isEven(){
		
		if(this.value % 2 == 0){
			System.out.print(value);
			return true;
		}
		return false;
	}

	public boolean isOdd(){
		
		if(this.value % 2 != 0){
			System.out.print(value);	
			return true;
		}
		return false;
	}

	public boolean isPrime(){
		
		for(int i = 2; i < this.value/2; i++){
			if(this.value % i == 0)
				return false;
			
		}
		System.out.print(value);
		return true;
	}
	// static methods
	public static boolean isEven(int value){
		boolean result = false;
		
		if(value % 2 == 0){
			System.out.print(value);
			result =  true;
		}
		
			return result;
		}
			
	public static boolean isOdd(int value){
		if(value % 2 != 0){
			System.out.print(value);
			return true;
		}
	
			return false;
		}
		
		
	public static boolean isPrime(int value){	
		for(int i = 2; i < value/2; i++){
			if(value % i == 0){
				return false;
			}
		}	
			System.out.print(value);
				return true;
			
		
	}
	public static boolean isEven(MyInteger m1){
		if(m1.value % 2 == 0){
			System.out.print(m1.value);
			return true;
		}
			return false;
		}
	public static boolean isOdd(MyInteger m1){
		if(m1.value % 2 != 0){
			System.out.print(m1.value);
			return true;
		}
			return false;
		}
	public static boolean isPrime(MyInteger m1){
		
		for(int i = 2; i < m1.value/2; i++){
			if(m1.value % i == 0)
				return false;
			
		}
		System.out.print(m1.value);
		return true;
	}
	public boolean equals(int value){
		
		System.out.print(getValue() + "," + value);
		if(getValue() == value)	
		return true;
		
		return false;
	}
	public boolean equals(MyInteger m){
		System.out.print(getValue() + "," + m.value);
		if(getValue() == m.value)	
			return true;
			
			return false;
		}
	public static int parseInt(char[] c){
		String str = new String(c);
		
		return Integer.parseInt(str);
	}
	public static int parseInt(String s){
		int number = Integer.parseInt(s);
	
		return number;
	}
}

