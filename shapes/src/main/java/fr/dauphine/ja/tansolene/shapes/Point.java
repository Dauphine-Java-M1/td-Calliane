package fr.dauphine.ja.tansolene.shapes;

public class Point {

	private int x;
	private int y;
	
	
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}

	Point(Point p){
		this.x = p.getX();
		this.y = p.getY();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public static void main(String[] args) {
		Point p=new Point(3,4);
		System.out.println(p.x+" "+p.y);
		System.out.println(p);
	}
}
