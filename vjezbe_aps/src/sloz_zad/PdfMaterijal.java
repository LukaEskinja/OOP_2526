package sloz_zad;

public class PdfMaterijal implements Pregledljivo {
    private String naziv;
    private int velicinaKB;

    public PdfMaterijal(String naziv, int velicinaKB) {
        this.naziv = naziv;
        this.velicinaKB = velicinaKB;
    }

    @Override
    public String naziv() {
        return naziv;
    }

    @Override
    public int velicinaKB() {
        return velicinaKB;
    }

    @Override
    public void otvori() {
        System.out.println("Otvoren PDF: " + naziv + " (" + velicinaKB + " KB)");
    }
}
