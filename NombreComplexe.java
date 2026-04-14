package tp2;

public class NombreComplexe {
	double reel;
	double img;
	NombreComplexe (double reel,double img){
		this.reel=reel;
		this.img=img;}
	NombreComplexe addition(NombreComplexe Z) {
		NombreComplexe S=new NombreComplexe(this.reel +Z.reel,this.img+Z.img);
		return S;
	}
	NombreComplexe multiplication(NombreComplexe z) {
		NombreComplexe P=new NombreComplexe(this.reel * z.reel - this.img * z.img,this.reel * z.img + this.img * z.reel);
		return P;
	}
	void afficher() {
		if(this.img>=0) {
			System.out.println(this.reel+"+"+this.img+"i");
		}else {
			System.out.println(this.reel+""+this.img+"i");
		}
	}
}
class Ex4{
	public static void  main(String[] args ) {
		NombreComplexe z1=new NombreComplexe(2,-1);
		NombreComplexe z2=new NombreComplexe(9,1);
		System.out.print("z1:");
		z1.afficher();
		System.out.print("z1:");
		z2.afficher();
		NombreComplexe S=z1.addition(z2);
		System.out.print("la somme est:");
		S.afficher();
		NombreComplexe P=z1.multiplication(z2);
		System.out.print("le produit est:");
		P.afficher();
}
}
