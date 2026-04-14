package tp2;

public class Rectangle {
	double largeur;
	double longueur;
	Rectangle (double largeur,double longueur){
		this.largeur=largeur;
		this.longueur=longueur;
	}
	double surface() {
		return this.largeur*this.longueur;
	}
	double perimetre() {
		return 2*(this.largeur+this.longueur);
	}
}
class Ex2{
	public static void  main(String[] args ) {
		Rectangle r1 =new Rectangle(12,10);
		System.out.println("rectangle r1  " );
	    System.out.println("Surface r1 : " + r1.surface()+"m^2");
	    System.out.println("Périmètre r1 : " + r1.perimetre()+"m");
	}
} 