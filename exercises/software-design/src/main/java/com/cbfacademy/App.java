package com.cbfacademy;

public class App {
    public static void main(String[] args) {

        Player player1 = PlayerFactory.create();
        Player player2 = PlayerFactory.create();

        Game game = new DiceGame(player1, player2);

        String winner = game.play();

        if (winner == null) {
            System.out.println("It's a draw!");
        } else {
            System.out.println(winner + " wins!");
        }
    }
}
