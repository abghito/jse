package com.example.jse.m05.s03.ex;

public class Cat {
	private static int count = 0;

	private String name;
	private String color;

	/**
	 * Cat with a given name and color
	 * 
	 * @param name  the cat name
	 * @param color the cat color
	 */
	public Cat(String name, String color) {
		// TODO: initialize the object
		this.name = name;
		this.color = color;
		// TODO: increase the counter
		count++;
	}

	/**
	 * @return the number of cats created via ctor
	 */
	public static int getCount() {
		return count;
	}

	/**
	 * The current cat meow on the console
	 */
	public void meow() {
		// TODO: Print name and color to System.out

		System.out.println(name + " " + color);
	}

	/**
	 * The current cat meow on the console
	 * 
	 * @param word to be printed on out console
	 */
	public void meow(String word) {
		// TODO: Print word, cat name and color to System.out
		System.out.println(name + "" + color + "meow");
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", color=" + color + "]";
	}

	public String getName() {
		return name;
	}
	
}
