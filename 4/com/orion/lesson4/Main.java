package com.orion.lesson4;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void welcome() {
        System.out.println("Добро пожаловать в игру! " +
                " Давайте начнём!");
    }

    public static void goodBuy(){
        System.out.println("До новых встреч! ~.^");
    }

    public static void showMenu() {
        System.out.println("Menu:" +
                " 1. Нажмите 1, чтобы начать игру." +
                " 2. Нажмите 0 для выхода. ");
    }

    public static void main(String[] args) {

        boolean end = false;

        welcome();

        do {
            showMenu();
            int choice = in.nextInt();
            switch (choice) {
                case 1 -> Game.startTheGame();
                case 0 -> end = true;
            }

        }while (!end);

        goodBuy();
    }

}
