package com.example.jse.m02.s12.ex;

public class Exercise3 {
    public static void main(String[] args) {
        /*
         * TODO: Print 
         * (1) the number of arguments passed to this main
         
         * (2) each argument
         */
    	System.out.print("the number of arguments passed to this main is: ");
    	System.out.println(args.length);
    	System.out.println("the arguments are: ");
    	for ( int i=0 ; i<args.length ; i++) {
    	System.out.println(args[i]);	
    	}
    }
}
