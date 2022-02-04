package com.example.jse.m02.s12.ex;

public class Exercise1 {
    public static void main(String[] args) {
        // TODO: print all values in [0 .. 9]
    
        // (1) for loop
    	for (int i=0;i<args.length ; i++) {
    		System.out.println(args[i]);
    	}
        // (2) while loop
    	int j=0;
    	while (j <args.length) {
    		System.out.println(args[j]);
    		j++;
    	}
    	
        // (3) do-while loop
    	int s=0;
    	
    	do {
    		System.out.println(args[s]);
    	}
    	while(s < args.length ; s++);
    }
}
