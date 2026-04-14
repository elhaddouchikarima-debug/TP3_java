package tp2;

public class Produit {
    int id;
    String nom;
    String description;
    double prix;
    int quantite;

    static int nombreProduits = 0;
    static int compteurId = 1;
    static Produit[] listeProduits = new Produit[120];

    public Produit(String nom, String description, double prix, int quantite) {
        this.id = compteurId++;
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.quantite = quantite;
    }
    public static void ajouterProd(String nom, String description, double prix, int quantite) {
        if (prix < 0 || quantite < 0) {
            System.out.println("Prix ou quantité invalides !");
            return;
        }
        if (nombreProduits < listeProduits.length) {
            Produit produit = new Produit(nom, description, prix, quantite);
            listeProduits[nombreProduits] = produit;
            nombreProduits++;
            System.out.println("Produit ajouté avec succès ! ID: " + produit.id);
        } else {
            System.out.println("Stock plein ! Impossible d'ajouter plus de produits.");
        }
    }

    public static Produit getProduitByID(int id) {
        for (int i = 0; i < nombreProduits; i++) {
            if (listeProduits[i] != null && listeProduits[i].id == id) {
                return listeProduits[i];
            }
        }
        return null;
    }

    public static void modifierProd(int id, String nom, String description, double prix, int quantite) {
        Produit p = getProduitByID(id);
        if (p == null) {
            System.out.println("Produit avec ID " + id + " introuvable !");
            return;
        }
        if (prix < 0 || quantite < 0) {
            System.out.println("Impossible de modifier (prix/quantité invalides) !");
            return;
        }
        p.nom = nom;
        p.description = description;
        p.prix = prix;
        p.quantite = quantite;
        System.out.println("Produit modifié avec succès ! ID: " + id);
    }
    public static void supprimerProd(int id) {
        for (int i = 0; i < nombreProduits; i++) {
            if (listeProduits[i] != null && listeProduits[i].id == id) {
                for (int j = i; j < nombreProduits - 1; j++) {
                    listeProduits[j] = listeProduits[j + 1];
                }
                listeProduits[nombreProduits - 1] = null;
                nombreProduits--;
                System.out.println("Produit supprimé avec succès !");
                return;
            }
        }
        System.out.println("Produit introuvable, pas supprimé !");
    }
    public static void getAllProduit() {
        if (nombreProduits == 0) {
            System.out.println("Aucun produit en stock.");
            return;
        }
        System.out.println(" LISTE DES PRODUITS ");
        for (int i = 0; i < nombreProduits; i++) {
            Produit p = listeProduits[i];
            System.out.println("ID: " + p.id +"Nom: " + p.nom +"Desc: " + p.description +"Prix: " + p.prix +" Quantité: " + p.quantite);
        }
    }
}
class ex7 {
    public static void main(String[] args) {
        Produit.ajouterProd("Clavier", "Clavier .....", 100.0, 10);
        Produit.ajouterProd("Souris", "Souris gaming", 120.0, 5);
        Produit.modifierProd(1, "Clavier", "Clavier ....",99.0, 8);
        Produit.supprimerProd(2);
        Produit.getAllProduit();
   }
}