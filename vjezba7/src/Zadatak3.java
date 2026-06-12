import java.util.concurrent.ArrayBlockingQueue;

public class Zadatak3 {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> red = new ArrayBlockingQueue<>(5);

        try {
            red.add(10);
            red.add(20);
            red.add(30);
            red.add(40);
            red.add(50);

            System.out.println("Red nakon dodavanja 5 elemenata: " + red);

            red.add(60);
        } catch (IllegalStateException e) {
            System.out.println("Greška: Ne možete dodavati više elemenata u red čekanja nego što je definirano (maksimalni kapacitet je 5)");
        }

        System.out.println();

        System.out.println("--- Pokretanje obrade (drugi dio zadatka) ---");

        boolean obradeno = obradiElement(red, 1);
        System.out.println("Stanje reda nakon pokušaja obrade: " + red);
        System.out.println();

        dodajNoviElement(red, 99, obradeno);
        System.out.println("Konačno stanje reda: " + red);
    }

    public static boolean obradiElement(ArrayBlockingQueue<Integer> red, int flag) {
        if (flag == 1) {
            Integer element = red.poll();
            if (element != null) {
                System.out.println("Element " + element + " je stavljen u obradu i uklonjen iz reda");
                return true;
            }
        } else if (flag == 0) {
            System.out.println("Red je u stanju čekanja. Nema obrade elemenata");
        }
        return false;
    }

    public static void dodajNoviElement(ArrayBlockingQueue<Integer> red, int noviElement, boolean jeObradjeno) {
        if (jeObradjeno) {
            red.add(noviElement);
            System.out.println("Uspješno ubačen novi element: " + noviElement);
        } else {
            System.out.println("Novi element " + noviElement + " čeka u redu jer prethodni element nije bio obrađen");
        }
    }
}
