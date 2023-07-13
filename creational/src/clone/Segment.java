package clone;

public class Segment implements Cloneable{
	
	private Point left, right;
	
	public Segment(Point left, Point right) {
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
		Segment segment = (Segment) super.clone();
		if(!(this.left instanceof Cloneable)||
				!(this.right instanceof Cloneable))
	        {
	            throw new CloneNotSupportedException("Invalid cloning");
	        }
		Point pleft = (Point) this.left.clone();
		Point pright = (Point) this.right.clone();
		segment.setLeft(pleft);
		segment.setRight(pright);
		return segment;
	}

}