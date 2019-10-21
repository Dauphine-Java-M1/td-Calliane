package fr.dauphine.ja.tansolene.shapes;

public class Circle {

	private Point centre;
	private int rayon;
	
	Circle(Point centre, int rayon){
		this.centre = centre;
		this.rayon = rayon;
	}
	
	

	@Override
	public String toString() {
		return "Circle [centre=" + centre + ", rayon=" + rayon +  ", surface=" + surface() + "]";
	}

	public void translate(int dx,int dy) {
		centre.translate(dx, dy);
	}
	
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	
	public boolean contains(Point p) {

		return Math.sqrt((p.getX()-centre.getX())*(p.getX()-centre.getX())+(centre.getY()-p.getY()))<=rayon;
	}
	
	public static boolean contains (Point p, Circle...circles) {
		for(Circle c: circles) {
			if(c.contains(p)) return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Circle c=new Circle(new Point(1,2), 1);
		c.getCentre().translate(1,1);
		System.out.println(c);
	}


	public Point getCentre() {
		return centre;
	}

	public void setCentre(Point centre) {
		this.centre = centre;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}
	
	
}
