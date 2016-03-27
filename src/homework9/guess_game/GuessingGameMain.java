package homework9.guess_game;

import java.util.Scanner;

/**
 * Created by Dim on 26.03.2016.
 */
public class GuessingGameMain {
    public static void main(String[] args) {
        int gameLowerNumber = -1000000;
        int gameUpperNumber = 1000000;

        GuessTheNumber game = new GuessTheNumber(gameLowerNumber,gameUpperNumber);

        //guessManually(game);

        guessAutomatically(gameLowerNumber, gameUpperNumber, game);
    }

    private static void guessAutomatically(int gameLowerNumber, int gameUpperNumber, GuessTheNumber game) {
        System.out.println();
        System.out.println("===CPU PLAYER===");
        GuessingGamer gamer = new GuessingGamer(game);
        gamer.start(gameLowerNumber,gameUpperNumber);
        System.out.println();
    }

    private static void guessManually(GuessTheNumber game) {
        System.out.println();
        System.out.println("===PROGRAMMER PLAYER===");
        Scanner s = new Scanner(System.in);
        int num;
        do {
            num = s.nextInt();
            game.guessing(num);
        } while (!game.gameOver());
        System.out.println();
    }
}
