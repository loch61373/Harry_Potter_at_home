package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("==============================================================================\n" +
                "\033[34m" + "Hello young Wizard ! \nWelcome to the magical world of Harry Potter, where wizards and witches lurk in the darkest corners of our world. \n" +
                "Before starting the adventure, let's create your profile. \nPlease enter your name: ");
        String nomSorcier = scanner.nextLine();
        System.out.print("\nWow "+ nomSorcier + " ! I feel an immense magical presence in you, a force that escapes the ordinary senses,\n" +
                "I am reassured because you will be led to do great things, very great things... \nOkay now, you are ready to begin your training at the Hogwarts School of Magic.\n" +
                "Before getting on the train, you'll have to go to Diagon Alley, a mysterious and fascinating place where you can buy all the supplies you need for your trip to Hogwarts.\n");
        System.out.print("Let's go to the magical menagerie first.\n" +
                "\nSeller: " + "\033[0m" + "Hello and Welcome! I have a large selection of magical pets for you. \n        What type of pet do you want? an OWL, a RAT, a CAT or a TOAD ?" + "\033[37m" + " Write your animal in capitals: " + "\033[0m");

        String choixAnimal = scanner.nextLine().toUpperCase();
        Pet animalDeCompagnie = Pet.valueOf(choixAnimal);
        System.out.println("\033[34m" + "\nSeller: " + "\033[0m" + "Excellent choice " + nomSorcier + " !");
        if ( animalDeCompagnie== Pet.OWL) {
            System.out.print("        Your owl will allow you to communicate with the outside world!");
        } else if (animalDeCompagnie == Pet.RAT) {
            System.out.print("        Your rat will be your faithful companion, even in difficult times!");
        } else if (animalDeCompagnie == Pet.CAT) {
            System.out.print("        Your cat will keep you company during your moments of relaxation!");
        } else if (animalDeCompagnie == Pet.TOAD) {
            System.out.print("        Your frog will be an excellent ally for potions!");
        }

        System.out.print(" I hope you take care of it." + "\n       I advise you now to go to Ollivander's shop, it is located on the main street, just after the cauldron shop." +
                "        \nDon't hesitate to come back here if you need anything else. Good luck !");

        System.out.print("Now let's go to Oliver and buy your wand. It's going to choose you, Let's go ? (yes, let's go) : ");
        String nomReponse = scanner.nextLine();
        Wand wand = new Wand();
        System.out.println("I believe a wand chose you " + nomSorcier + "! Congratulations ! Your wand is made of " + wand.getCore() + " and is" + wand.getSize() + " inch tall.");


        System.out.println("Now let's determine your Hogwarts house. Answer the following questions:");

        SortingHat sortingHat = new SortingHat();
        sortingHat.startSorting(scanner);

    }
}



