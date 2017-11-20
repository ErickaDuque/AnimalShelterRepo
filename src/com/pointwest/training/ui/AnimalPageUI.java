package com.pointwest.training.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.AnimalBean;
import com.pointwest.training.manager.AnimalShelterAppManager;

public class AnimalPageUI {
	AnimalShelterAppManager animalManager = new AnimalShelterAppManager();

	// What animal to create
	public void displayAnimalPage(List<AnimalBean> listOfAnimals) {
		System.out.println("What animal are you trying to add?");
		System.out.println("[1] A Dog");
		System.out.println("[2] A Cat");
		System.out.println("[3] A Parrot");
		Scanner createAnimalScanner = new Scanner(System.in);
		int createAnimalInput = createAnimalScanner.nextInt();

		listOfAnimals = addAnimal(createAnimalInput, listOfAnimals);

		System.out.println("Animal is now added.");
	}

	// Method to call addAnimal from Manager
	public List<AnimalBean> addAnimal(int createAnimalInput, List<AnimalBean> listOfAnimals) {
		listOfAnimals = animalManager.addAnimal(createAnimalInput, listOfAnimals);
		return listOfAnimals;
	}

	// Add animal's details
	public AnimalBean addAnimalDetails(AnimalBean newAnimal) {
		String animalDetailsInput;

		System.out.println("What is the animal's name?");
		Scanner animalDetailsScanner = new Scanner(System.in);
		animalDetailsInput = animalDetailsScanner.nextLine();
		newAnimal.setAnimalName(animalDetailsInput);

		System.out.println("What is the animal's age?");
		animalDetailsInput = animalDetailsScanner.nextLine();
		newAnimal.setAnimalAge(animalDetailsInput);

		System.out.println("What is the animal's gender? (Male/Female)");
		animalDetailsInput = animalDetailsScanner.nextLine();
		newAnimal.setAnimalGender(animalDetailsInput);

		return newAnimal;
	}

	// What animal to remove
	public List<AnimalBean> removeAnimalPage(List<AnimalBean> listOfAnimals) {
		System.out.println("Please enter the reference ID of the animal to remove: ");
		Scanner removeAnimalscanner = new Scanner(System.in);
		int animalToRemove = removeAnimalscanner.nextInt();
		listOfAnimals = animalManager.removeAnimal(animalToRemove, listOfAnimals);
		return listOfAnimals;
	}

	// Confirm that animal was removed
	public void isAnimalRemoved(boolean isRemoved) {
		if (isRemoved == true) {
			System.out.println("Animal is removed.");
		} else {
			System.out.println("Animal was not removed.");
		}
	}

	// View all animals created
	public void viewAnimals(List<AnimalBean> listOfAnimals) {

		System.out.println(("Meet our lovely animal friends!\n"));

		for (AnimalBean animal : listOfAnimals) {
			System.out.print(animal.getAnimalReferenceID() + ": ");
			System.out.print("Hi! I'm " + animal.getAnimalName() + " the " + animal.getAnimalGender() + " " + animal.getClass().getSimpleName() + ", "
					+ animal.getAnimalAge() + " years old.");
			System.out.print(" " + animal.getAnimalSound());
			System.out.println();
		}
	}

}
