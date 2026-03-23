package pckg_osnovni_vecera;

import pckg_outsourcing_vecera.PastetaTuna;

public class Meni {

    private JuhaPoriluk jp = new JuhaPoriluk();
    private PastetaTuna pt = new PastetaTuna();

    public Meni() {


        jp.meniInfoJP();
        pt.meniInfoJP();
    }

    public void cijenaSimul(JuhaPoriluk pr1, PastetaTuna pr2) {

        int sum = pr1.getJedCijena() + pr2.getJedCijena();

        System.out.println("Cijena za jednu juhu i jednu paštetu: " + sum);

    }

}