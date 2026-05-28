package S_M2;

public class SeminarskiRad implements Ocjenjivo {
    private String tema;
    private int ocjenaMentora;

    public SeminarskiRad(String tema, int ocjenaMentora) {
        this.tema = tema;
        this.ocjenaMentora = ocjenaMentora;
    }

    @Override
    public int bodovi() {
        return ocjenaMentora;
    }

    @Override
    public String naziv() {
        return "Seminarski rad: " + tema;
    }
}