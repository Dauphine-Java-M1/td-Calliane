package fr.dauphine.ja.tansolene.shapes;

public class Ligne {

	private Point[] points;
	private int nbr;
	
	Ligne(Point p, int nbr){
		points[0].setX(p.getX());
		points[0].setY(p.getY());
		for(int i=1; i<nbr;i++) {
			points[i].setX(p.getX()+i);
			points[i].setY(p.getY());
		}
		this.nbr = nbr;
	}
	
	public void add(Point p) {
		points[nbr].setX(p.getX());
		points[nbr].setY(p.getY());
		nbr++;
	}
}
