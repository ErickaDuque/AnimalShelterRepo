package com.pointwest.training.beans;

public class Dog extends AnimalBean {
	String animalSound = "woof! woof! woof! ";

	public String getAnimalSound() {
		return animalSound;
	}

	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}
}
