package com.kodilla.rps;


import java.util.Random;
import java.util.Scanner;

public class RpsLogic {

    private String name;
    private int turnNumbers = 0;
    private int playerScore;
    private int computerScore;
    private Scanner scanner = new Scanner(System.in);
    private boolean end = false;

    public void playGame() {
        prepareGame();

        while (!end) {
            game();
        }
    }

    private void prepareGame() {
        System.out.println("Podaj swoje imię.");
        name = scanner.nextLine();
        newGame();
        System.out.println("Instrukcja sterowania: \n" +
                "-klawisz 1 - zagranie \"kamień\";\n" +
                "-klawisz 2 - zagranie \"papier\";\n" +
                "-klawisz 3 - zagranie \"nożyce\";\n" +
                "-klawisz x - zakończenie gry;\n" +
                "-klawisz n - uruchomienie gry od nowa");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }

    private void game() {
        System.out.println("Wykonaj swój ruch: \n" +
                "(1-kamień; 2-papier; 3-nożyce)");
        char choice = scanner.next().charAt(0);

        if (choice == 'x') {
            endGame();
        } else if (choice == 'n') {
            newGame();
        } else if (choice == '1' || choice == '2' || choice == '3') {
            analyseChoice(choice);
        } else {
            System.out.println("Podano złe polecenie!");
        }

        if (turnNumbers == playerScore || turnNumbers == computerScore) {
            resultGame();
        }
    }

    private void resultGame() {
        boolean charPositive = false;

        System.out.println("Koniec gry" +
                "\nComputer: " + computerScore +
                "\n" + name + ": " + playerScore);

        while (!charPositive) {
            System.out.println("Naciśnij x aby zakonczyć, lub n aby zagrać jeszcze raz.");
            char choice = scanner.next().charAt(0);
            if (choice == 'x') {
                end = true;
                charPositive = true;
            }
            if (choice == 'n') {
                newGame();
                charPositive = true;
            }
        }
    }

    private void newGame() {
        turnNumbers = 0;
        System.out.println("Podaj ilość wygranych rund by wygrać.");
        String numbersFromScanner = scanner.next();
        while (!(numbersFromScanner.chars().allMatch(Character::isDigit) && Integer.parseInt(numbersFromScanner) > 0)) {
            System.out.println("Podano niewłaściwą liczbę. Podaj ilość wygranych rund by wygrać.");
            numbersFromScanner = scanner.next();
        }
        turnNumbers = Integer.parseInt(numbersFromScanner);
        playerScore = 0;
        computerScore = 0;
    }

    private void endGame() {
        System.out.println("Czy napewno chcesz zakończyc? (T/N)");
        if (scanner.next().equalsIgnoreCase("T")) {
            end = true;
        } else if (scanner.next().equalsIgnoreCase("N")) {
            //Do nothing
        } else {
            endGame();
        }
    }

    private void analyseChoice(char playerChoice) {
        Random random = new Random();
        int computerChoiceInt = random.nextInt(3) + 1;
        int playerChoiceInt = Character.getNumericValue(playerChoice);

        if (computerChoiceInt == playerChoiceInt) {
            System.out.println("Remis");
        } else if (playerChoiceInt == ROCK) {
            if (computerChoiceInt == SCISSORS) playerWinTurn();
            else computerWinTurn();
        } else if (playerChoiceInt == PAPER) {
            if (computerChoiceInt == ROCK) playerWinTurn();
            else computerWinTurn();
        } else if (playerChoiceInt == SCISSORS) {
            if (computerChoiceInt == PAPER) playerWinTurn();
            else computerWinTurn();
        }
    }

    private void playerWinTurn() {
        System.out.println(name + " wygrywa tą turę.");
        playerScore++;
    }

    private void computerWinTurn() {
        System.out.println("Computer wygrywa tą turę");
        computerScore++;
    }

    private final int ROCK = 1;
    private final int PAPER = 2;
    private final int SCISSORS = 3;
}
