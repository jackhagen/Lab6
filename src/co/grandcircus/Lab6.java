package co.grandcircus;

//@author Jack Hagen

import java.util.Random;
import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus Casino");
		System.out.println();
		System.out.println("How many sides do your dice have?: ");
		int dieSides1 = scnr.nextInt();
		String userChar = scnr.nextLine();
		int numRolls = 1;

		System.out.println("Press any key to roll. Good luck!");
		userChar = scnr.nextLine();

		System.out.println("Roll " + numRolls + ":");
		System.out.println(generateRandomDiceRoll(dieSides1));
		System.out.println(generateRandomDiceRoll(dieSides1));

		System.out.println();
		System.out.println("Do you want to roll again? (y/n)");
		userChar = scnr.nextLine();

		while (userChar.equalsIgnoreCase("y") || userChar.equalsIgnoreCase("Yes")) {

			numRolls = numRolls + 1;
			System.out.println("Roll " + numRolls + ":");
			System.out.println(generateRandomDiceRoll(dieSides1));
			System.out.println(generateRandomDiceRoll(dieSides1));
			System.out.println();
			System.out.println("Do you want to roll again? (y/n)");
			System.out.println();
			userChar = scnr.nextLine();
		}

		while (userChar.equalsIgnoreCase("n") || userChar.equalsIgnoreCase("No")) {
			System.out.println("Thanks for playing!");
			break;
		}

		scnr.close();
	}

	public static int generateRandomDiceRoll(int numSides) {

		return (int) Math.ceil(Math.random() * numSides);
	}

	public static int generateRandomDiceRoll2(int numSides) {

		Random r = new Random();
		return r.nextInt(numSides);
	}

}

//double randNum = Math.random() * dieSide