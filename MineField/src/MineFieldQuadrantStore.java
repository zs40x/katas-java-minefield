import java.util.ArrayList;
import java.util.List;


public class MineFieldQuadrantStore {
	
	private MineField mineField;
	private List<MineFieldQuadrant> mineFieldQuadrants = new ArrayList<MineFieldQuadrant>();
	
	public MineFieldQuadrantStore(MineField mineField) {
		this.mineField = mineField;
	}
	
	public MineFieldQuadrant getMineFieldQuadrant(Position pos) {
		MineFieldQuadrant quadrant = null;
		
		for( MineFieldQuadrant tmpQuadrant : this.mineFieldQuadrants ) {
			if( tmpQuadrant.Position.Equals(pos) ) {
				return tmpQuadrant;
			}
		}
		
		if( pos.X >= 1 && pos.X <= this.mineField.Size_X 
				&& pos.Y >= 1 && pos.Y <= this.mineField.Size_Y ) {
			quadrant = new MineFieldQuadrant(pos.Clone());
			this.mineFieldQuadrants.add(quadrant);
		} else {
			return new MineFieldQuadrant(new Position(0,0));
		}
		
		return quadrant;
	}
	
	public int getNeighbourMineCountForPos(Position pos) {
		int mineCount = 0;
		
		MineFieldQuadrant quadrant =
				this.getMineFieldQuadrant(pos);
		
		if( this.getNeighbour_NW(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_N(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_NE(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_W(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_E(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_SW(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_S(quadrant).containsMine() )
			mineCount++;
		if( this.getNeighbour_SE(quadrant).containsMine() )
			mineCount++;
		
		return mineCount;
	}
	
	
	public MineFieldQuadrant getNeighbour_NW(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X-1, quadrant.Position.Y-1));
	}
	
	public MineFieldQuadrant getNeighbour_N(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X, quadrant.Position.Y-1));
	}
	
	public MineFieldQuadrant getNeighbour_NE(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X+1, quadrant.Position.Y-1));
	}
	
	public MineFieldQuadrant getNeighbour_W(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X-1, quadrant.Position.Y));
	}
	
	public MineFieldQuadrant getNeighbour_E(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X+1, quadrant.Position.Y));
	}
	
	public MineFieldQuadrant getNeighbour_SW(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X-1, quadrant.Position.Y+1));
	}
	
	public MineFieldQuadrant getNeighbour_S(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X, quadrant.Position.Y+1));
	}
	
	public MineFieldQuadrant getNeighbour_SE(MineFieldQuadrant quadrant) {
		return this.getMineFieldQuadrant(new Position(quadrant.Position.X+1, quadrant.Position.Y+1));
	}
}
