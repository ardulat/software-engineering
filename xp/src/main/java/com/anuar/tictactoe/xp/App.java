package com.anuar.tictactoe.xp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TicTacToe game = new TicTacToe();
        
        game.play(1, 1);
        game.play(1, 2);
        game.play(1, 3);
        game.play(2, 2);
        game.play(2, 3);
        game.play(3, 3);
        game.play(2, 1);
        game.play(3, 1);
        game.play(3, 2);
    }
}
