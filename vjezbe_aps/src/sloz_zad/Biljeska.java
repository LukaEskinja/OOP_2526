package sloz_zad;

public class Biljeska implements Ispisivo {
    private String tekst;

    public Biljeska(String tekst) {
        this.tekst = tekst;
    }

    @Override
    public void ispisi() {
        System.out.println("Biljeska: " + tekst);
    }
}
