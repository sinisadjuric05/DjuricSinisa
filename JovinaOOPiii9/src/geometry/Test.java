package geometry;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(5,6);
		p.getX();
		Point p1 = new Point(7,0);
		Point p2 = new Point(5,6);
		System.out.println(p.toString());
		p.toString();
		Line l = new Line(new Point(5,6), new Point(8,9));
		Line l1 = new Line(new Point(5,6), new Point(8,9));
		System.out.println(l.toString());
		Circle k = new Circle(new Point(5,6), (3));
		System.out.println(k.toString());
		System.out.println(p.equals(p1));
		System.out.println(p.equals(p2));
		System.out.println(l.equals(l));
	}

} 
