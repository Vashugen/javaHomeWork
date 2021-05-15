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
                " 1. Нажмите 1, чтобы начать игру." +
                " 2. Нажмите 0 для выхода. ");
    }

    //TODO to Class Game
    public static void startTheGame(){
        //Game game = new Game();

        int characterCount = 10;

        //dowhile
        System.out.println("Введите количество магов (1-10): ");
        int mageCount = in.nextInt();

        System.out.println("Введите количество монстров от 1 до : " + (characterCount - mageCount));
        int monsterCount = in.nextInt();

        Scene scene = new Scene(mageCount, monsterCount);

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
