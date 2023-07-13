package clone;

public class UsePoints {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Point p1 = new Point(1, 2);
		Point p2 = (Point)p1.clone();
		p1.setX(5);
		System.out.println(p1);
		System.out.println(p2);

		SimpleSegment s1 = new SimpleSegment(p1, p2);
		SimpleSegment s2 = (SimpleSegment) s1.clone();
		System.out.println("Before update: "+s1+", "+s2);
		
		p1.setX(10);
		System.out.println("After update: "+s1+", "+s2);
		
		Segment s3 = new Segment(p1, p2);
		Segment s4 = (Segment) s3.clone();
		System.out.println("Segment->Before update: "+s3+", "+s4);
		p1.setX(20);
		System.out.println("Segment->After update: "+s3+", "+s4);
		
	}

}
