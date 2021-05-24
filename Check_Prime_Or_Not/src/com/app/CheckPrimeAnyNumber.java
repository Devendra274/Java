package com.app;

 
public class CheckPrimeAnyNumber {
  
    public static void main(String[] args) {
          
        System.out.println("OUTPUT:");
         
        System.out.println(41 +" is prime (true/false): "+ Prime(41));
        System.out.println(341 +" is prime (true/false): "+ Prime(341));
        System.out.println(441 +" is prime (true/false): "+ Prime(441));
        System.out.println(541 +" is prime (true/false): "+ Prime(541));
     }
    
    public static boolean Prime(int num) {
    	 int boundryValueToCheck = (int) Math.sqrt(num);
             
	     for(int i = 2; i < boundryValueToCheck; i++) {
	         if(num % i == 0) 
	             return false;
	     }
	     return true;
    }
}
