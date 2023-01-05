package entities;

public class ArticleImpl implements IArticle {

    @Override
    public Article saisie() {
        Article A = new Article(1,"categorie");
        return A;
    }

    @Override
    public void affichage(Article a) {
        System.out.println("ID :" + a.getId());
        System.out.println("LIBELLE :" + a.getLib());
    }
}
