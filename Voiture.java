package tp2;

public class Voiture {
	String marque;
	double vitesse;
	static final double VITESSE_MAX = 240.0;
	Voiture(String marque) {
		this.marque= marque;
        this.vitesse = 0;
    }
	void accelerer(double x) {
        vitesse += x;
        if (vitesse > VITESSE_MAX) {
            vitesse = VITESSE_MAX;
            System.out.println("Vitesse maximale atteinte : " + VITESSE_MAX + " km/h");
        } else {
            System.out.println("Accélération ! Vitesse : " + vitesse + " km/h");
        }
    }
	void freiner(double x) {
        vitesse -= x;
        if (vitesse < 0) {
            vitesse = 0;
            System.out.println("La voiture est à l'arrêt.");
        } else {
            System.out.println("Freinage ! Vitesse : " + vitesse + " km/h");
        }
    } 
}
class ex6{
	public static void  main(String[] args ) {
		Voiture v =new Voiture("BMW");
		v.accelerer(20);
		v.freiner(40);
		
	}
}
