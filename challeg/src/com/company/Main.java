package com.company;

public class Main {

    public static void main(String[] args) {

        displayHighScore("John ",1);
        int playerNewScore = calculateHighScorePosition(1500);
            System.out.println(playerNewScore);

        displayHighScore("ken ", 2);
        playerNewScore = calculateHighScorePosition(900);
        System.out.println(playerNewScore);

        displayHighScore("tim ", 3);
        playerNewScore = calculateHighScorePosition(400);
        System.out.println(playerNewScore);


        displayHighScore("Karen", playerNewScore);
        playerNewScore = calculateHighScorePosition(50);
        System.out.println(playerNewScore);

    }

    public static void displayHighScore(String playerName,int position) {
        System.out.println("Player name: " + playerName + "managed to get into " +position + " position on the High Score Table!");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }}
