package zadatci_abs;

public abstract class Proizvod {

    protected String naziv;

    protected int id;

    private static int cntID = 1;

    protected float jedCijena;

    protected float kolicina;

    protected Proizvod(String naziv, float JedCijena, float kolicina){
        this.id = cntID++;

    }
}
