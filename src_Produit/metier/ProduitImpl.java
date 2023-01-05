package metier;

import java.util.Scanner;

public class ProduitImpl implements IProduit {

    @Override
    public Produit saisie() {
        Produit P = new Produit("CH001","LIBELLE",12,12);
         return P;

}

    @Override
    public void affichage(Produit p) {

        System.out.println("REFERENCE : " + p.getRef());
        System.out.println("LIBELLE : " + p.getLibelle());
        System.out.println("QUANTITE : " + p.getQuantite());
        System.out.println("PRIX : " + p.getPrix());
        System.out.println();
    }
}
