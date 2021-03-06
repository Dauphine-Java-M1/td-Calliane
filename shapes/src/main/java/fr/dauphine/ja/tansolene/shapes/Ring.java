package fr.dauphine.ja.tansolene.shapes;

public class Ring extends Circle{



	private int rayonInt;
	
	
	Ring(Point centre, int rayon, int rayonInt) {
		super(centre, rayon);
		this.setRayonInt(rayonInt);
	}
	
	public boolean equals(Circle c){
		if(c.getCentre()==this.getCentre() && c.getRayon()==this.getRayon()) return true;
		return false;
	}


	@Override
	public String toString() {
		return super.toString() + "Ring [rayonInt=" + rayonInt + "]";
	}
	
	@Override
	public boolean contains(Point p) {
		return super.contains(p) &&
				Math.sqrt((p.getX()-super.getCentre().getX())*(p.getX()-super.getCentre().getX())+(super.getCentre().getY()-p.getY()))>rayonInt;
	}
	
	public static boolean contains(Point p, Ring...rings){
		for(Ring r: rings) {
			if(r.contains(p)) return true;
		}
		return false;
	}

	public int getRayonInt() {
		return rayonInt;
	}


	public void setRayonInt(int rayonInt) {
		this.rayonInt = rayonInt;
	}
}
