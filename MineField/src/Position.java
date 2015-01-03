
public class Position {
	
	public final int X;
	public final int Y;
	
	public Position(final int x, final int y) {
		this.X = x;
		this.Y = y;
	}
	
	public Position Clone() {
		return new Position(this.X, this.Y);
	}
	
	public boolean Equals(Position pos) {
		if( pos.X == this.X && pos.Y == this.Y )
			return true;
		return false;
	}
}
