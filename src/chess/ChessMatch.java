package chess;

import boardGame.Board;
import boardGame.Position;
import chess.pieces.King;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;

	public ChessMatch() {
		board = new Board(8,8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumns()];
		for(int i = 0;i < board.getRow();i++) {
			for (int j = 0;j < board.getColumns();j++) {
				mat[i][j] = (ChessPiece)board.piece(i, j);
			}
		}
		return mat;
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 0));
		board.placePiece(new Rook(board, Color.WHITE), new Position(7, 7));
		board.placePiece(new King(board, Color.WHITE), new Position(7, 4));
		board.placePiece(new Queen(board, Color.WHITE), new Position(7, 3));
	}
}
