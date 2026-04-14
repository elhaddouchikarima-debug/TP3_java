package tp2;

public class Etudiant {
	 	String cne;
	    double note;

	    public Etudiant(String cne, double note) {
	        this.cne = cne;
	        this.note = note;
	    }
	    public boolean estAdmis() {
	        return note >= 12.0;
	    }
	    public String toString() {
	        return "Etudiant{cne='" + cne + "', note=" + note + ", admis=" + estAdmis() + "}";
	    }
	}
class ex3 {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant("CNE12345", 12.5);
        Etudiant e2 = new Etudiant("CNE67890", 8.0);
        System.out.println(e1.toString());
        System.out.print(e2.toString());
    }
}


