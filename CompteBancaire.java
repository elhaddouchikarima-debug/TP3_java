package tp2;
public class CompteBancaire {
	int numero;
	double solde;
	 public CompteBancaire(int numero, double solde) {
	        this.numero = numero;
	        this.solde = solde;
	 }
	void deposer(double montant) {
		 if (montant > 0) {
	            solde += montant;
	            System.out.println("Dépôt de " + montant + " MAD effectué avec succès.");
	        }else {
	        	System.out.println("le depos est impossible!");
	        }
	 }
	void retirer(double montant) {
		 if (montant > 0 && solde >= montant) {
	            solde -= montant;
	        }else {
	        	System.out.println("Impossible de retirer ce montant!!");
	        }
	}
	void transferer(double montant, CompteBancaire D) {
        if (montant > 0) {
            if (solde >= montant) {
                this.solde -= montant;
                D.solde += montant;
                System.out.println("Transfert de " + montant + "MAD  effectué vers le compte n°" + D.numero);
            } else {
                System.out.println("Solde insuffisant pour effectuer le transfert!");
            }
        } else {
            System.out.println("Le montant du transfert doit être positif!");
        }
	}
	void afficherSolde() {
		System.out.println(" Solde : " + solde +"MAD");
		}
}
class ex5{ 
	public static void  main(String[] args ) {
		CompteBancaire compte1 = new CompteBancaire(123456, 1000);
        CompteBancaire compte2 = new CompteBancaire(789012, 500);
        System.out.print("compte 1:");
        compte1.afficherSolde();
        System.out.print("compte 2:");
        compte2.afficherSolde();
        compte1.deposer(200);
        System.out.print("compte 1 apres depot de 200MAD:");
        compte1.afficherSolde();
        System.out.print("compte 1 apres le retire de 150 MAD:");
        compte2.retirer(150);
        compte2.afficherSolde();
        compte1.transferer(300, compte2);
        compte1.afficherSolde();
        compte2.afficherSolde();
	}
}

