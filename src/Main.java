import entities.ArticleImpl;
import entities.ChemiseImpl;
import entities.IArticle;
import entities.IChemise;

public class Main {
    public static void main(String[] args) {
        IChemise C = new ChemiseImpl();
        C.affichage(C.saisie());
    }
}