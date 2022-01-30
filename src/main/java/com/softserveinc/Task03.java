package com.softserveinc;

import java.util.Scanner;

/*A real coffee machine never has an infinite supply of water, milk, or coffee beans. And if you input a really big number, it’s almost certain that a real coffee machine wouldn't have the supplies needed to make all that coffee.

In this stage, you need to improve the previous program. Now you need to input amounts of water, milk, and coffee beans that your coffee machine has at the moment.

If the coffee machine has enough supplies to make the specified amount of coffee, the program should print "Yes, I can make that amount of coffee". If the coffee machine can make more than that, the program should output "Yes, I can make that amount of coffee (and even N more than that)", where N is the number of additional cups of coffee that the coffee machine can make. If the amount of resources is not enough to make the specified amount of coffee, the program should output "No, I can make only N cup(s) of coffee".

Like in the previous stage, the coffee machine needs 200 ml of water, 50 ml of milk, and 15 g of coffee beans to make one cup of coffee.

Instruction
 Open the file Task03.java.
 Write a program that calculates whether it will be able to make the required amount of coffee from the specified amount of ingredients.
Hint
Use static method Math.min() to find how many cups of coffee it is possible to make
Use if ... else if ... else operator to print right message
Examples
The program should firstly request for water, then milk, then beans, then amount of cups.

The symbol >>> represents the user input. Notice that it's not the part of the input.

Example 1
Write how many ml of water the coffee machine has:
>>> 300
Write how many ml of milk the coffee machine has:
>>> 65
Write how many grams of coffee beans the coffee machine has:
>>> 100
Write how many cups of coffee you will need:
>>> 1
Yes, I can make that amount of coffee*/

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();

        System.out.println("Write how many gram of beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();


        System.out.println("Write how many cups of coffee you will need:");
        int wantedCups = scanner.nextInt();

        int waterOnePortion = 200;
        int milkOnePortion = 50;
        int beansOnePortion = 15;

        int canMakeCupsWater = water / waterOnePortion;
        int canMakeCupsMilk = milk / milkOnePortion;
        int canMakeCupsBeans = beans / beansOnePortion;
        int canMakeCups;
        canMakeCups = canMakeCupsWater;
        if (canMakeCupsMilk < canMakeCups) {
            canMakeCups = canMakeCupsMilk;
        }
        if (canMakeCupsBeans < canMakeCups) {
            canMakeCups = canMakeCupsBeans;
        }
        if (wantedCups == canMakeCupsBeans) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (wantedCups > canMakeCupsBeans){
            System.out.println("No, I can make only " + canMakeCupsBeans + " cup(s) of coffee" );

        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (canMakeCups - wantedCups) + " more than that");
        }
    }
}














