package com.softserveinc;

import java.util.Scanner;

/*Write how many ml of water the coffee machine has:
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

        int water;
        int milk ;
        int coffee;
        int count;
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.println(">>>");
        water = scan.nextInt();

        System.out.println("Write how many ml of the milk machine has:");
        System.out.println(">>>");
        milk = scan.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.println(">>>");
        coffee = scan.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        count = scan.nextInt();

        int minCups = 0;
        int minCupsWater = water / 200;
        int minCupsMilk = milk / 50;
        int minCupsCoffee = coffee / 15;
        minCups = minCupsWater;
        if(minCupsMilk < minCups) {
            minCups = minCupsMilk;
        }
        if(minCupsCoffee < minCups) {
            minCups = minCupsCoffee;
        }
        if (count == minCups) {
            System.out.println("Yes, I can make that amount of coffee");

        }

        System.out.println("Yes, I can make that amount of coffee");
        }
    }





