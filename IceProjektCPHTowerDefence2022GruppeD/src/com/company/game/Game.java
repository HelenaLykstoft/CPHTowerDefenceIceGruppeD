package com.company.game;

import java.util.Scanner;

public class Game {
    StringBuilder userInput = new StringBuilder(); //builds a string for user input
    Scanner scan = new Scanner(System.in);
    //Player player = new Player;
    GameMap gamemap = new GameMap();


    public void runGame() {
        gameDescription();
        userMenu();
    }

    public void registerPlayer() {
        String startMessage = "\nPress R to register a Player or Q to quit:";
        String endMessage = "You pressed Q - quitting registration menu";

        System.out.println(startMessage);
        userInput.append(scan.nextLine());

        if (userInput.toString().equalsIgnoreCase("R")) {
            insertPlayerInfo();
        } else if (userInput.toString().equalsIgnoreCase("Q")) {
            System.out.println(endMessage);
            scan.close();
        }
    }

    public void insertPlayerInfo() {
    }

    private void gameDescription() {
        String bullet = "\u2022 ";

        System.out.println(">> Welcome to CPH Tower Defense game <<");
        System.out.println("\n**** DESCRIPTION ****" +
                "\nTower Defence er et spil hvor man bygger nogle tårne for at beskytte sin by mod fjender. " +
                "\nSom spiller handler det om at bruge disse tårne til at forhindre forskellige bølger af fjender " +
                "\nmod at trænge ind i sin by. Jo flere fjender man skyder ned jo flere penge får du til at kunne udvikle dine tårne. ");
        System.out.println("\n**** RULES ****" + "\n" + bullet + "put some text here" +
                "\n" + bullet + "put some text here" +
                "\n" + bullet + "put some text here" +
                "\n" + bullet + "put some text here");
    }

    private void userMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**** MENU ****");
        System.out.println("Press 0 to quit the menu");
        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to load the game");
        System.out.println("Press 3 to pause the game");
        System.out.println("Press 4 to end the game");
        System.out.println("Press 5 to insert player information");

        // handle user commands
        boolean quit = false;
        int menu;

        do {
            menu = scan.nextInt();
            switch (menu) {
                case 1:
                    startGame();
                    userMenu();
                    break;
                case 2:
                    loadGame();
                    userMenu();
                    break;
                case 3:
                    pauseGame();
                    userMenu();
                    break;
                case 4:
                    endGame();
                    userMenu();
                    break;
                case 5:
                    registerPlayer();
                    userMenu();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice..");
            }
        } while (!quit);
        System.out.println("You quit the menu!");
    }

    private void startGame() {
        System.out.println("you have started the game");
    }

    private void loadGame() {
        System.out.println("you have loaded the game");
    }

    private void pauseGame() {
        System.out.println("you have paused the game");
    }

    private void endGame() {
        System.out.println("you have ended the game");
    }
}

