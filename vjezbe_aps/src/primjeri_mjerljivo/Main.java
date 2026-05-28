package primjeri_mjerljivo;

public class Main {
    public static Mjerljivo pronadiMax(Mjerljivo[] niz) {
        Mjerljivo max = niz[0];
        for (int i = 1; i < niz.length; i++) {
            if (niz[i].dajVrijednost() > max.dajVrijednost()) {
                max = niz[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Mjerljivo[] mjerenja = {
                new Temperatura(36.6),
                new UdaljenostKm(120.5),
                new Temperatura(38.1),
                new UdaljenostKm(42.0)
        };

        Mjerljivo naj = pronadiMax(mjerenja);
        System.out.println("Najveca vrijednost: " + naj);
    }
}
