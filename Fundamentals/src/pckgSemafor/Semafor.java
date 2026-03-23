package pckgSemafor;

public class Semafor {
    private static String zeleno = "1";
    private static String crveno = "0";
    private static String zuto = "2";

    public String getZeleno() {
        return zeleno;
    }

    public void setZeleno(String zeleno) {
        Semafor.zeleno = zeleno;
    }

    public String getCrveno() {
        return crveno;
    }

    public void setCrveno(String crveno) {
        Semafor.crveno = crveno;
    }

    public String getZuto() {
        return zuto;
    }

    public void setZuto(String zuto) {
        Semafor.zuto = zuto;
    }

    public void stanje(int num) {
        String stanje = String.valueOf(num);
        System.out.println("Testiram stanje semafora za: " + stanje);
        System.out.println("------------------------------------");
        if(stanje.equals(zeleno)){
            System.out.println("Kod je za zeleno svjetlo -> prolaz.");
        } else if(stanje.equals(zuto)){
            System.out.println("Kod je za žuto svjetlo -> oprez.");
        } else if(stanje.equals(crveno)){
            System.out.println("Kod je za crveno svjetlo -> stoj.");
        } else {
            System.out.println("Nepostojeći kod - semafor izvan upotrebe!!!");
        }
    }
}

