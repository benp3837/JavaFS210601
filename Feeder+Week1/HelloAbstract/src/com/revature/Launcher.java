package com.revature;

import com.revature.models.Associate;
import com.revature.models.Person;

public class Launcher {

	public static void main(String[] args) {
		
		//BTW, we can auto import things with ctrl + shift + o
		
		//Instantiate a Associate object
		//This is an example of UPCASTING! Which is considered good practice
		//If the variable wasn't of type Person, we wouldn't have access to the name and age fields found in Person
		Person ryan = new Associate("111111", "Ryan", 22);

		ryan.juggle();
		
		ryan.jump(700);
		
		ryan.move(500);
		
		//Notice how this trip functionality is the trip functionality found ALL the way in the Sprintable Interface
		//The associate class never mentions it, but it extends Person, which implements Sprintable
		//Inheritance is super powerful!
		ryan.trip();
		
	}

}
