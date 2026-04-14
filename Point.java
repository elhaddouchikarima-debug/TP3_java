package tp2;
public class Point {
	double x,y;
    Point() {
		this.x=0;
		this.y=0;
	}
	Point (double x,double y) {
		this.x = x;
		this.y = y;
	}
	void AfficherPoint() {
		System.out.println(" ("+this.x+" , "+this.y+" )");
	}
	void DeplacerPoint(double dx, double dy) {
		this.x+=dx;
		this.y+=dy; 
	}
	double distanceOrigine() {
		return Math.sqrt(Math.pow(this.x, 2)+Math.pow(this.y,2));
	}
	double Distance2Pts(Point p2) {
		return Math.sqrt(Math.pow(p2.y-this.y,2)+Math.pow(p2.x-this.x, 2));
	}
}
class exercice1{
	public static void  main(String[] args ) {
		Point p1 =new Point(2,-1);
		Point p2 =new Point(0,1);
		System.out.print("p1");
		p1.AfficherPoint();
		System.out.print("p2");
		p2.AfficherPoint();
		p1.DeplacerPoint(2,2);
		System.out.println("p1 apres deplacement");
		p1.AfficherPoint();
		System.out.println("la distance de p1 a l'origine est: "+p1.distanceOrigine());
		System.out.println("la distance entre p1 et p2  est: "+p1.Distance2Pts(p2));
	}
}