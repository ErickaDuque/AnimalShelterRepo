package com.pointwest.training.beans;

public abstract class AnimalBean {
	static int animalCounter = 1001;
	protected int animalReferenceID;
	protected String animalName;
	protected String animalAge;
	protected String animalGender;
	protected String animalSound;

	public static void incrementAnimalCounter() {
		animalCounter = AnimalBean.getAnimalCounter();
		animalCounter++;
	}

	// Getters and Setters
	public static int getAnimalCounter() {
		return animalCounter;
	}

	public static void setAnimalCounter(int animalCounter) {
		AnimalBean.animalCounter = animalCounter;
	}

	public int getAnimalReferenceID() {
		return animalReferenceID;
	}

	public void setAnimalReferenceID(int animalReferenceID) {
		this.animalReferenceID = animalReferenceID;
	}

	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalAge() {
		return animalAge;
	}

	public void setAnimalAge(String animalAge) {
		this.animalAge = animalAge;
	}

	public String getAnimalGender() {
		return animalGender;
	}

	public void setAnimalGender(String animalGender) {
		this.animalGender = animalGender;
	}

	public String getAnimalSound() {
		return animalSound;
	}

	public void setAnimalSound(String animalSound) {
		this.animalSound = animalSound;
	}

}
