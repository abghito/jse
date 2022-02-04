package com.example.jse.m05.s03.ex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = { "Tom", "Bob", "Kit", "Zip", "Kit" };
        String[] colors = { "blue", "green", "yellow", "black", "blue" };

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(colors));

        // TODO: (1) 
        System.out.println("create an array of cats, same size of the arrays above");
        Cat[] cats = new Cat[names.length];
        System.out.println(String.format("There are %d cats in the array", cats.length));

        // TODO: (2) 
        System.out.println("---------initialize the cats array--------");
       
        // each cat should have name and color from the arrays above
        for(int i = 0; i<cats.length; i++) {
        	cats[i]= new Cat(names[i],colors[i]);
        }

        System.out.println(String.format("Currently there are %d cats in the program", Cat.getCount()));

        // TODO: (3) each cat should meow
        System.out.println("--------each cat should meow---------");
        for(int i = 0; i<cats.length; i++) {
        	cats[i].meow();
        }

        // TODO: (4) each cat named Kit should meow
        System.out.println("--------each cat named Kit should meow---------");
        for(int i = 0; i<cats.length; i++) {
        	if(cats[i].getName().equals("kit")) {
        		cats[i].meow();
        	}
        }

        // TODO: (5) only the first cat named Kit should meow
        System.out.println("--------only the first cat named Kit should meow---------");
        for(int i = 0; i<cats.length; i++) {
        	if(cats[i].getName().equals("kit")) {
        		cats[i].meow();
        	break;
        	
        	}
        	
        }


        // TODO: (6) only the cats in even position should meow
        
    }
}
