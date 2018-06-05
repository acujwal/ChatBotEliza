package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String name, question = "";
        Random r = new Random();

        Scanner input = new Scanner(System.in);
        String[] hedges = {"Why do you say that", "You seem to think that", "So, you are concerned that"};
        String[] qualifiers = {"Why do you say that", "You seem to think that", "So, you are concerned that"};


        System.out.println("Welcome to the Chat bot. I am Eliza! \nPlease Enter Your Name : ");
        name = input.nextLine();

        System.out.println("Hello, " + upperCase(name) + "\nI am Eliza, How can I help you? or Enter \"quit\" to exit");
        question = input.nextLine();

        while (!question.equals("quit")) {

            int hedg = 0 + r.nextInt(hedges.length - 1);
            int qualifier = 0 + r.nextInt(qualifiers.length - 1);

            String i = question.replaceFirst("I", "you");
            String me = i.replaceFirst("me", "you");
            String my = me.replaceFirst("my", "your");
            String am = my.replaceFirst("am", "are");

            if (question.contains("I") || question.contains("me") || question.contains("am") || question.contains("my")) {
                System.out.println(hedges[hedg] + " " + am);
            } else {
                System.out.println(qualifiers[qualifier]);
            }
            System.out.println("Enter your response here  or \"quit\" to exit:");
            question = input.nextLine();

        }
        System.out.println("Thank You for your cooperation");
    }
    // method
    public static String upperCase(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}



