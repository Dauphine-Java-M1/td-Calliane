package fr.dauphine.ja.tansolene.shapes;

import java.util.LinkedList;
import java.util.Objects;

public class Ligne {

	private LinkedList<Point> points;
//	private int nbr;
	
//	Ligne(Point p, int nbr){
//		points[0].setX(p.getX());
//		points[0].setY(p.getY());
//		for(int i=1; i<nbr;i++) {
//			points[i].setX(p.getX()+i);
//			points[i].setY(p.getY());
//		}
//		this.nbr = nbr;
//	}
//	
//	public void add(Point p) {
//		points[nbr].setX(p.getX());
//		points[nbr].setY(p.getY());
//		nbr++;
//	}
	Ligne() {
		this.points =new LinkedList<Point>();
	
	}
	
	public void add(Point p) {
		Objects.requireNonNull(p, "ne pas ajouter point null");
		points.add(p);
	}
	
	public int nbPoints() {
		return points.size();
	}
	
	public boolean contains(Point p) {
		Objects.requireNonNull(p, "ne peut être null");
		return points.contains(p);
}
}
