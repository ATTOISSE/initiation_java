import metier.IProduit;
import metier.Produit;
import metier.ProduitImpl;

public class Main {
    public static void main(String[] args) {
        IProduit P = new ProduitImpl();
        System.out.println("Affichage du Produit");
        P.affichage(P.saisie());
    }
}