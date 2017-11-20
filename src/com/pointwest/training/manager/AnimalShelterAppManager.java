package com.pointwest.training.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.AnimalBean;
import com.pointwest.training.beans.Cat;
import com.pointwest.training.beans.Dog;
import com.pointwest.training.beans.Parrot;
import com.pointwest.training.ui.AnimalPageUI;

public class AnimalShelterAppManager {

	// Select what animal to create
	public List<AnimalBean> addAnimal(int createAnimalInput, List<AnimalBean> listOfAnimals) {
		AnimalPageUI animalPageUI = new AnimalPageUI();

		Scanner scanner = new Scanner(System.in);

		if (createAnimalInput == 1) { // Add Dog
			Dog dog = new Dog();
			dog.setAnimalReferenceID(AnimalBean.getAnimalCounter());
			animalPageUI.addAnimalDetails(dog);
			listOfAnimals.add(dog);
			AnimalBean.incrementAnimalCounter();
		} else if (createAnimalInput == 2) { // Add Cat
			Cat cat = new Cat();
			cat.setAnimalReferenceID(AnimalBean.getAnimalCounter());
			animalPageUI.addAnimalDetails(cat);
			listOfAnimals.add(cat);
			cat.incrementAnimalCounter();
		} else if (createAnimalInput == 3) { // Add Parrot
			Parrot parrot = new Parrot();
			parrot.setAnimalReferenceID(AnimalBean.getAnimalCounter());
			animalPageUI.addAnimalDetails(parrot);
			listOfAnimals.add(parrot);
			parrot.incrementAnimalCounter();
		}

		return listOfAnimals;
	}

	// Remove animal based on entered Reference ID
	public List<AnimalBean> removeAnimal(int animalToRemove, List<AnimalBean> listOfAnimals) {
		AnimalPageUI animalPageUI = new AnimalPageUI();
		boolean isRemoved = false;

		for (AnimalBean animal : listOfAnimals) {
			if (animal.getAnimalReferenceID() == animalToRemove) {
				listOfAnimals.remove(animal);
				isRemoved = true;
				break;
			}
		}
		animalPageUI.isAnimalRemoved(isRemoved);
		return listOfAnimals;
	}

}
