/*
 * Author:Nidhi
 * Desc:Using an inheritance hierarchy, design a Java program to model items at
 *  a library (books, journal articles, videos and CDs.) 
 *  Have an abstract superclass called Item and include common information that the library 
 *  must have for every item (such as unique identification number, title, and number of copies).
 */
package com.cg.lab4;

public class Main {

	public static void main(String[] args) {
		Item video = new Video(1, "Movie", 1, 3);
		System.out.println(video);
		Item video1 = new Video();
	}
}
