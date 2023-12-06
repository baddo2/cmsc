
public class Plot {

	private int x;
	private int y;
	private int width;
	private int depth;

	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	public Plot(Plot otherPlot) {
		this.x = otherPlot.x;
		this.y = otherPlot.x;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;

	}
	
	
	public boolean encompasses(Plot plot) {
	    int x2 = plot.x + plot.width;
	    int y2 = plot.y + plot.depth;
	    int thisX2 = this.x + this.width;
	    int thisY2 = this.y + this.depth;

	    return plot.x >= this.x && x2 <= thisX2 && plot.y >= this.y && y2 <= thisY2;
	}
	
	public int getDepth() {
		return depth;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public boolean overlaps(Plot plot) {
		int x2 = plot.x + plot.width;
		int y2 = plot.y + plot.depth;
		int thisX2 = this.x + this.width;
		int thisY2 = this.y + this.depth;

		return x2 > this.x && plot.x < thisX2 && y2 > this.y && plot.y < thisY2;
	}
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
        return x + "," + y + "," + width + "," + depth;
	}

}