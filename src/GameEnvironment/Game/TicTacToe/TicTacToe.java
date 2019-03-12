package GameEnvironment.Game.TicTacToe;

import GameEnvironment.Board;
import GameEnvironment.GameFactory;
import GameEnvironment.GameGUI;
import GameEnvironment.Interaction;
import GameEnvironment.Piece;

public class TicTacToe implements GameFactory {
	public TicTacToe() {
		buildGame("TicTacToe");	
	}

	@Override
	public void buildGame(String gameName) {
		new GameGUI(buildBoard(), gameName);		
	}

	@Override
	public Board buildBoard() {
		return new TicTacToeBoard(4, 3, 2, Interaction.BOARD, buildPieces());
	}

	@Override
	public Piece buildPieces() {
		return new TicTacToePiece("", 1);
	}	
}

