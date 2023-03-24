package org.example;

import java.util.*;

public class SortingHat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hogwarts! Let's determine your house...");
        System.out.println("Please answer the following questions with A, B, C, or D.");
    }


    public static void startSorting(Scanner scanner) {
        // Initialize variables to keep track of letter counts for each house
            int gryffindorCount = 0;
            int hufflepuffCount = 0;
            int ravenclawCount = 0;
            int slytherinCount = 0;

            // Ask the user 6 questions
            String[] questions = {"Q1: Which of these traits best describes you?",
                    "Q2: What is your favorite class at Hogwarts?",
                    "Q3: Which magical creature would you most like to have as a pet?",
                    "Q4: Which of these Hogwarts professors do you admire most?",
                    "Q5: What would you do if you found a lost item in Hogwarts?",
                    "Q6: Which Hogwarts ghost do you like the most?"};

            String[][] answers = {{"A. Brave", "B. Loyal", "C. Intelligent", "D. Ambitious"},
                    {"A. Defense Against the Dark Arts", "B. Herbology", "C. Charms", "D. Potions"},
                    {"A. Phoenix", "B. Niffler", "C. Hippogriff", "D. Basilisk"},
                    {"A. Albus Dumbledore", "B. Minerva McGonagall", "C. Remus Lupin", "D. Severus Snape"},
                    {"A. Turn it in to the lost and found department", "B. Ask around to see if anyone has lost it", "C. Keep it for yourself", "D. Ignore it and walk away"},
                    {"A. Nearly Headless Nick", "B. The Bloody Baron", "C. The Grey Lady", "D. Peeves"}};

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                for (int j = 0; j < answers[i].length; j++) {
                    System.out.println(answers[i][j]);
                }
                String answer = scanner.nextLine().toUpperCase();
                switch (answer) {
                    case "A":
                        gryffindorCount++;
                        break;
                    case "B":
                        hufflepuffCount++;
                        break;
                    case "C":
                        ravenclawCount++;
                        break;
                    case "D":
                        slytherinCount++;
                        break;
                    default:
                        System.out.println("Invalid answer, please try again.");
                        i--;
                        break;
                }
            }

            // Calculate the percentages for each house
            int totalCount = gryffindorCount + hufflepuffCount + ravenclawCount + slytherinCount;
            int gryffindorPercentage = (int)Math.round((double)gryffindorCount / totalCount * 100);
            int hufflepuffPercentage = (int)Math.round((double)hufflepuffCount / totalCount * 100);
            int ravenclawPercentage = (int)Math.round((double)ravenclawCount / totalCount * 100);
            int slytherinPercentage = (int)Math.round((double)slytherinCount / totalCount * 100);

            // Determine the house with the highest percentage
            int maxPercentage = Math.max(Math.max(gryffindorPercentage, hufflepuffPercentage),
                    Math.max(ravenclawPercentage, slytherinPercentage));
            if (maxPercentage == gryffindorPercentage) {
                System.out.println("Congratulations! You're in Gryffindor!");
            } else if (maxPercentage == hufflepuffPercentage) {
                System.out.println("Congratulations! You're in Hufflepuff!");
            } else if (maxPercentage == ravenclawPercentage) {
                System.out.println("Congratulations! You're in Ravenclaw!");
            } else {
                System.out.println("Congratulations! You're in Slytherin!");
            }

        }

    }

