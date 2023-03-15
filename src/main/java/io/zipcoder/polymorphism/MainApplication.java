package io.zipcoder.polymorphism;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
public class MainApplication {

    public static void main(String[] args) {

        // String response = "";
        int numberOfPets = 0;
        String typeOfPet = "";
        String petName = "";


        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello. How many pets do you have? Enter a number followed by 'return'.");
        numberOfPets = scanner.nextInt();
        scanner.nextLine();

        if (numberOfPets == 0) {
            System.out.println("Thank you, goodbye.");
            System.exit(0);
        }

        System.out.println("Welcome, we catalog dogs, cats and birds.");
        System.out.println("Let's catalog each of your pets.");
        if (numberOfPets == 1) {
            System.out.println("What type of animal is your pet?");
            System.out.println("Please enter 'dog', 'cat' or bird'.");
            typeOfPet = "";

            while (!Objects.equals(typeOfPet, "dog") && !Objects.equals(typeOfPet, "cat") && !Objects.equals(typeOfPet, "bird")) {
                typeOfPet = scanner.nextLine();
                if (!Objects.equals(typeOfPet, "dog") && !Objects.equals(typeOfPet, "cat") && !Objects.equals(typeOfPet, "bird")) {
                    System.out.println("Invalid type. Please enter dog, cat, or bird.");
                }
            }

            System.out.println("You entered: " + typeOfPet);
            System.out.println("What is your " + typeOfPet + "'s name?");
            petName = scanner.nextLine();

        } else {
            for (int i = 0; i < numberOfPets; i++) {
                System.out.println("What type of animal is your next pet?");
                typeOfPet = "";
                while (!Objects.equals(typeOfPet, "dog") && !Objects.equals(typeOfPet, "cat") && !Objects.equals(typeOfPet, "bird")) {
                    typeOfPet = scanner.nextLine();
                    if (!Objects.equals(typeOfPet, "dog") && !Objects.equals(typeOfPet, "cat") && !Objects.equals(typeOfPet, "bird")) {
                        System.out.println("Invalid type. Please enter dog, cat, or bird.");
                    }
                }
                System.out.println("You entered: " + typeOfPet);
                System.out.println("What is your " + typeOfPet + "'s name?");
                petName = scanner.nextLine();
            }
        }
        System.out.println("Thank you, goodbye.");
    }
}

//System.out.println("Invalid entry, goodbye");