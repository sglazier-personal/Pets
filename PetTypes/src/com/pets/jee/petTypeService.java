package com.pets.jee;

public class petTypeService {
	public String petType(String animal) {
		String animalType = "";
		if ("Lion".equals(animal)) {
			animalType = "Big and Scary";
		} else if ("Dog".equals(animal)) {
			animalType = "Smelly";
		} else if ("Cat".equals(animal)) {
			animalType = "Crazy";
		} else {
			animalType = "I don't know!";
		}
		return animalType;
	}
}