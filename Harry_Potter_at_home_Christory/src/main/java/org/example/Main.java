package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Hello young wizard! What is your name?");
        String nomSorcier = scanner.nextLine();
        System.out.println("Welcome to Hogwarts, " + nomSorcier + " !");


        System.out.print("Before starting the adventure, you have to go to the crossroads. What animal do you want? (OWL, RAT, CAT, TOAD): ");
        String choixAnimal = scanner.nextLine().toUpperCase();
        Pet animalDeCompagnie = Pet.valueOf(choixAnimal);
        System.out.println("Excellent choice young wizard !");
        if ( animalDeCompagnie== Pet.OWL) {
            System.out.println("Your owl will allow you to communicate with the outside world!");
        } else if (animalDeCompagnie == Pet.RAT) {
            System.out.println("Your rat will be your faithful companion, even in difficult times!");
        } else if (animalDeCompagnie == Pet.CAT) {
            System.out.println("Your cat will keep you company during your moments of relaxation!");
        } else if (animalDeCompagnie == Pet.TOAD) {
            System.out.println("Your frog will be an excellent ally for potions!");
        }



        System.out.print("Now let's go to Oliver and buy your wand. It's going to choose you, Let's go ? (yes, let's go) : ");
        String nomReponse = scanner.nextLine();
        Wand wand = new Wand();
        System.out.println("I believe a wand chose you " + nomSorcier + "! Congratulations ! Your wand is made of " + wand.getCore() + " and is" + wand.getSize() + " inch tall.");


        // Ask questions to determine house
        System.out.println("Now let's determine your Hogwarts house. Answer the following questions:");

        SortingHat sortingHat = new SortingHat();
        sortingHat.startSorting(scanner);

    }
}



