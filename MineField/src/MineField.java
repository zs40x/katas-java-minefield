

public class MineField {
	public final int Size_X;
	public final int Size_Y;
	
	private MineFieldQuadrantStore mineFieldQuadrantStore;
	
	
	public MineField(final int size_X, final int size_Y) {
		this.Size_X = size_X;
		this.Size_Y = size_Y;
		
		this.mineFieldQuadrantStore = new MineFieldQuadrantStore(this);
	}
	
	public void placeMine(int pos_X, int pos_Y) {
		this.mineFieldQuadrantStore.getMineFieldQuadrant(new Position(pos_X, pos_Y)).setContainsMine(true);
	}
	
	public String getQuadrantValue(int pos_X, int pos_Y) {
		String quadrantValue = "";
		Position pos = new Position(pos_X, pos_Y);
		
		if( this.mineFieldQuadrantStore.getMineFieldQuadrant(pos).containsMine() ) {
			quadrantValue = "*";
		} else {
			quadrantValue = Integer.toString( this.mineFieldQuadrantStore.getNeighbourMineCountForPos(pos) );
		}
		
		return quadrantValue;
	}
	
	
}
