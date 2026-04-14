package tp2;
import java.util.Scanner;
import java.util.Random;
public class Bonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int a = r.nextInt(10) + 1;
        int choix, essais = 0 ,score = 10;
        System.out.println("Deviner un nombre aléatoire entre 1 et 10.");
        do {
            System.out.print("Votre choix : ");
            choix = sc.nextInt();
            essais++;
            if (choix < a) {
                System.out.println("Trop petit !");
                if (score > 0) score--;
            } else if (choix > a) {
                System.out.println("Trop grand !");
                if (score > 0) score--;
            } else {
                System.out.println("Bravo !");
                System.out.println("Nombre d'essais : " + essais);
                System.out.println("Score : " + score + "/10");
            }
        } while (choix != a);

        sc.close();
	}

}
