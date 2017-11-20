package com.pointwest.training.ui;

import java.util.List;
import java.util.Scanner;

import com.pointwest.training.beans.AnimalBean;

public class HomePageUI {

	public int displayHomepageOne(boolean isEmpty) {
		Scanner homepageScanner = new Scanner(System.in);
		System.out.println("\nWelcome to EJ's Animal Shelter!");
		System.out.println("Please select an option:");

		// Menu option when Animal Shelter is empty
		if (isEmpty == true) {
			System.out.println("The shelter is currently empty.");
			System.out.println("[1] Add an Animal");
		}
		// Menu options when Animal Shelter is not empty
		else if (isEmpty == false) {
			System.out.println("[1] Add an Animal");
			System.out.println("[2] Remove an Animal");
			System.out.println("[3] View all Animals");
		}

		int homePageInput = homepageScanner.nextInt();

		return homePageInput;
	}

	//Menu options when Animal Shelter is full
	public int displayHomepageTwo() {
		Scanner homepageScanner = new Scanner(System.in);
		System.out.println("\nWelcome to EJ's Animal Shelter!");
		System.out.println("Please select an option:");
		System.out.println("[1] Remove an Animal");
		System.out.println("[2] View all Animals");

		int homePageInput = homepageScanner.nextInt();

		return homePageInput;
	}

	// Display when Animal Shelter is full
	public int displayAnimalShelterFull() {
		System.out.println("The animal shelter is now full. We can no longer accept a new animal.");
		System.out.println("Do you want to continue? [1]Yes [2]No");

		Scanner continueScanner = new Scanner(System.in);
		int continueProgram = continueScanner.nextInt();

		return continueProgram;
	}

	//End Program
	public void endProgram() {
		System.out.println("Program Ends. Goodbye!");
	}

}
