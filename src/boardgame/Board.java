package boardgame;

public class Board {

	private int rows;
	private int columns;
	
	private Pieces[][] pieces;

	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Pieces [rows][columns];
		
	}
	
	
	
}
