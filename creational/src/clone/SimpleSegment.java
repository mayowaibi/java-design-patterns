package clone;

public class SimpleSegment implements Cloneable{
	
	private Point left, right;
	
	public SimpleSegment(Point left, Point right) {
		this.left = left;
		this.right = right;
	}
	
	public void setLeft(Point left) {
		this.left = left;
	}
	
	public void setRight(Point right) {
		this.right = right;
	}
	
	public Point getLeft() {
		return new Point(this.left.getX(), this.left.getY());
	}
	
	public Point getRight() {
		return new Point(this.right.getX(), this.right.getY());
	}
	
	@Override public String toString() {
		return this.left.toString()+"--"+this.right.toString();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
