package entities;

public class ChemiseImpl implements  IChemise{
    @Override
    public Chemise saisie() {
        Chemise C = new Chemise(1,"categorie","categorie");
        return C;
    }

    @Override
    public void affichage(Chemise c) {
        System.out.println("ID :" + c.getId());
        System.out.println("LIBELLE :" + c.getLib());
        System.out.println("LIBELLE :" + c.getCouture());
    }
}
