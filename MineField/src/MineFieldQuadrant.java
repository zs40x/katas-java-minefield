
public class MineFieldQuadrant {
	private MineField MineField;
	public final Position Position;
	private boolean ContainsMine = false;
	
	public MineFieldQuadrant(final Position position) {
		this.Position = position;
	}
	
	public void setContainsMine(boolean containsMine) {
		this.ContainsMine = containsMine;
	}
	
	public boolean containsMine() {
		return this.ContainsMine;
	}
}
