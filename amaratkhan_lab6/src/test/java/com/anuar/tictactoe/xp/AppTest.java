package com.anuar.tictactoe.xp;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest 
{
	private TicTacToe t;
	
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Before
	public void setUp() {
		t = new TicTacToe();
	}
	
	@Test
	public void outOfBounds() {
		e.expect(RuntimeException.class);
		t.play(4, 5);
	}
	
	@Test
	public void isOccupied() {
		t.play(1, 2);
		e.expect(RuntimeException.class);
		t.play(1, 2);
	}
	
	@Test
	public void nextPlayerX() {
		t.play(1, 2);
		assertEquals("Next player - X", 'X', t.getNextPlayer());
	}
	
	@Test
	public void nextPlayerO() {
		assertEquals("Next player - O", 'O', t.getNextPlayer());
	}
	
	@Test
	public void hasWinner() {
		t.play(1, 1);
        t.play(1, 2);
        t.play(1, 3);
        t.play(2, 2);
        t.play(2, 3);
        t.play(3, 2);
        assertEquals("The player has won?", true, t.hasWinner);
	}
	
	@Test
	public void isDraw() {
		t.play(1, 1);
        t.play(1, 2);
        t.play(1, 3);
        t.play(2, 2);
        t.play(2, 3);
        t.play(3, 3);
        t.play(2, 1);
        t.play(3, 1);
        t.play(3, 2);
        assertEquals("The game is draw?", true, t.endGame);
	}
}
