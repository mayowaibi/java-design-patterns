package clone;

public class Point implements Cloneable{
	
	private int x,y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
    public int getX() {
    	return this.x;
    }
    
    public int getY() {
    	return this.y;
    }
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public String toString() {
		return "("+this.x+" ,"+this.y+")";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


		
	

}
