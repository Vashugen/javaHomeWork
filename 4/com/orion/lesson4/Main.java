package com.orion.lesson4;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Random rand = new Random();
    public static Scanner in = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Welcome to tje game! " +
                " Lets start!");
    }

    public static void goodbuy(){
        System.out.println("Good buy, see you soon ~^");
    }

    public static void showMenu() {
        System.out.println("Menu:" +
                " 1. Press 1 to start the game." +
                " 2. Press 0 to quit the game. ");
    }

    //TODO to Class Game
    public static void startTheGame(){

    }

    public static void main(String[] args) {

        int choice;

        welcome();

        do {
            showMenu();
            choice = in.nextInt();
        }while (choice != 0 && choice != 1);

        //TODO switch
        if(choice == 1){
            startTheGame();
        }else{
            goodbuy();
        }

        Scene scene = new Scene();

        System.out.println("Введите количество магов: ");

        int mageCount = in.nextInt();


        for (int i = 1; i <= mageCount; i++) {
            Mage mage = new Mage("маг № " + i, rand.nextInt(30));
        }

        //проверка на превышение количества магов

        /*System.out.println("Введите количество монстров: ");
        int monsterCount = in.nextInt();

        scene.fill(mageCount, monsterCount);*/


    }

}
