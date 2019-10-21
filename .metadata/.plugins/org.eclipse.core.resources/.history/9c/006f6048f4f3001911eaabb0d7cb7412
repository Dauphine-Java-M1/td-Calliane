package fr.dauphine.ja.tansolene.shapes;

import java.util.ArrayList;

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
	
	public boolean inSameAs(Point p) {
		if(p.getX()== this.x && p.getY()== this.y) {
			return true;
		}
		return false;
		
	}
	
	
	public static void main(String[] args) {
		Point p=new Point(3,4);
		System.out.println(p.x+" "+p.y);
		System.out.println(p);
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
		System.out.println(p1==p2);
		System.out.println(p1.inSameAs(p3));
		
		
		ArrayList<Point> list = new ArrayList<Point>();
		list.add(p1);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
}
