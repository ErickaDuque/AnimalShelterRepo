package com.pointwest.training.main;

import java.util.ArrayList;
import java.util.List;

import com.pointwest.training.beans.AnimalBean;
import com.pointwest.training.manager.AnimalShelterAppManager;
import com.pointwest.training.ui.AnimalPageUI;
import com.pointwest.training.ui.HomePageUI;

public class AnimalShelterAppMain {

	public static void main(String[] args) {
		HomePageUI homePageUI = new HomePageUI();
		AnimalPageUI animalPageUI = new AnimalPageUI();

		// List of Animals
		List<AnimalBean> listOfAnimals = new ArrayList<AnimalBean>();

		boolean endProgram = false;
		boolean isShelterEmpty = false;
		int homePageOption;

		while (endProgram == false) {
			// If Animal Shelter is not full
			if (listOfAnimals.size() != 10) {
				// While Animal Shelter is not full
				while (listOfAnimals.size() != 10) {
					// Check if Animal Shelter is empty
					if (listOfAnimals.size() == 0) { 
						isShelterEmpty = true;
					}

					else if (listOfAnimals.size() > 0) {
						isShelterEmpty = false;
					}
					// Menu to display while Animal Shelter is not full
					homePageOption = homePageUI.displayHomepageOne(isShelterEmpty);
					switch (homePageOption) {
					case 1: // Add an Animal
						animalPageUI.displayAnimalPage(listOfAnimals);
						break;
					case 2: // Remove an Animal
						animalPageUI.removeAnimalPage(listOfAnimals);
						break;
					case 3: // View all Animals
						animalPageUI.viewAnimals(listOfAnimals);
						break;
					}
				}
			}
			// If Animal Shelter is full
			else if (listOfAnimals.size() == 10) {
				int continueProgram = homePageUI.displayAnimalShelterFull();

				switch (continueProgram) {
				case 1: // Continue Program
					while (listOfAnimals.size() == 10) {
						homePageOption = homePageUI.displayHomepageTwo();
						switch (homePageOption) {
						case 1: // Remove an Animal
							animalPageUI.removeAnimalPage(listOfAnimals);
							break;
						case 2: // View all Animals
							animalPageUI.viewAnimals(listOfAnimals);
							break;
						}
					}
					break;
				case 2: // End Program
					endProgram = true;
					break;
				}
			}
		}
		// Exit the loop and End the Program
		homePageUI.endProgram();
	}

}
