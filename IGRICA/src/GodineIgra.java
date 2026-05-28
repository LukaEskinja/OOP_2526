import java.util.Scanner;

public class GodineIgra {

    private static final int TOCNA_GODINA = 1991;

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("   IGRA POGAĐANJA GODINA");
        System.out.println("==============================================");
        System.out.println("Pokušajte pogoditi traženu godinu!");
        System.out.println("Unesite 'izlaz' u bilo kojem trenutku za kraj.");
        System.out.println("==============================================\n");

        int pokusaji = 0;
        boolean pogodeno = false;
        int donjaGranica = 0;
        int gornjaGranica = 9999;

        while (!pogodeno) {
            System.out.printf("Trenutni interval: [%d, %d]%n", donjaGranica, gornjaGranica);
            System.out.println("----------------------------------------------");

            try {
                System.out.print("Unesite vašu pretpostavku (godina): ");
                String unosGodine = unos.nextLine().trim();
                provjeriIzlaz(unosGodine);

                int pretpostavka = Integer.parseInt(unosGodine);
                pokusaji++;

                if (pretpostavka < donjaGranica || pretpostavka > gornjaGranica) {
                    throw new GodineIznimka(String.format(
                            "Pretpostavka %d nije unutar intervala [%d, %d]!",
                            pretpostavka, donjaGranica, gornjaGranica
                    ));
                }

                if (pretpostavka == TOCNA_GODINA) {
                    System.out.println("\n✓ CESTITAMO! Pogodili ste godinu: " + TOCNA_GODINA);
                    System.out.println("Broj pokusaja: " + pokusaji);
                    System.out.println("==============================================");
                    pogodeno = true;

                } else if (pretpostavka < TOCNA_GODINA) {
                    System.out.println("-> Trazena godina je VECA od " + pretpostavka + ".");
                    donjaGranica = pretpostavka + 1;

                } else {
                    System.out.println("-> Trazena godina je MANJA od " + pretpostavka + ".");
                    gornjaGranica = pretpostavka - 1;
                }

                System.out.println();

            } catch (GodineIznimka e) {
                System.out.println("[POGRESKA] " + e.getMessage());
                System.out.println("Pokusajte ponovo.\n");

            } catch (NumberFormatException e) {
                System.out.println("[POGRESKA] Unesite ispravni cijeli broj.\n");
            }
        }

        unos.close();
    }


    private static void provjeriIzlaz(String vrijednost) {
        if (vrijednost.equalsIgnoreCase("izlaz")) {
            System.out.println("\nIzlazite iz igre. Dovidenja!");
            System.out.println("==============================================");
            System.exit(0);
        }
    }
}