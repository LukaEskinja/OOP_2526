package pckg_util;

import pckg_evidencija.*;
import pckg_model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CitacPodataka {

    public void ucitajStudente(String putanja, StudentskaEvidencija evidencija) {

        class ParserRetkaStudenta{
            Student parsiraj(String redak, int brojRetka) {
                String[] dijelovi = redak.split(";");

                if (dijelovi.length != 6){
                    System.out.println("UPOZORENJE [studenti.txt, redak" + brojRetka
                    + "]: očekivano 5 polja, pronađeno " + dijelovi.length + " -> preskačem: " + redak );

                    return null;

                }

                String JMBAG = dijelovi[0].trim();
                String ime = dijelovi[1].trim();
                String prezime = dijelovi[2].trim();
                String studij = dijelovi[3].trim();

                int godinaUpisa;

                String email = dijelovi[5];

                try{
                    godinaUpisa = Integer.parseInt(dijelovi[4].trim());
                } catch (NumberFormatException e) {
                    System.out.println("Upozorenje [studenti.txt, redak" + brojRetka
                    + "]: godina upisa nije broj -> preskačem" + redak);
                    return null;
                }

                return new Student(ime, prezime, godinaUpisa, JMBAG, studij, email);

            }
        }

        ParserRetkaStudenta parser = new ParserRetkaStudenta();

        try(Scanner sc = new Scanner(new File(putanja))) {
            int brojRetka = 0;

            while (sc.hasNextLine()){
                String redak = sc.nextLine();
                brojRetka++;
                if (redak.isBlank()) {
                    continue;
                }

                Student student = parser.parsiraj(redak, brojRetka);
                if (student != null) {
                    evidencija.dodajStudenta(student);
                }

            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Greška: Ne mogu otvoriti datoteku:" + putanja);
        }
    }

    public void ucitajOcjene(String putanja, StudentskaEvidencija evidencija) {

        class ParserRetkaOcijena {

            class RezultatParsiranja {
                private String JMBAG;
                private Predmet predmet;
                private int ocjena;


                RezultatParsiranja(String JMBAG, int ocjena, Predmet predmet) {
                    this.JMBAG = JMBAG;
                    this.ocjena = ocjena;
                    this.predmet = predmet;
                }
            }
            RezultatParsiranja parsiraj(String redak, int brojRetka) {
                String[] dijelovi = redak.split(";");

                if (dijelovi.length != 6){
                    System.out.println("UPOZORENJE [studenti.txt, redak" + brojRetka
                            + "]: očekivano 5 polja, pronađeno " + dijelovi.length + " -> preskačem: " + redak );

                    return null;

                }

                String JMBAG = dijelovi[0].trim();
                String naziv = dijelovi[1].trim();
                String kategorija = dijelovi[3].trim();
                int ECTS;
                int ocjena;
                String semestar = dijelovi[5];

                try {
                    ECTS = Integer.parseInt(dijelovi[2].trim());

                } catch (NumberFormatException nfe) {
                    System.out.println("UPOZORENJE [ocjene.txt, redak " + brojRetka
                            + "]: ECTS nije broj -> preskačem: " + redak);
                    return null;
                }

                try{
                    ocjena = Integer.parseInt(dijelovi[4].trim());
                } catch (NumberFormatException e) {
                    System.out.println("UPOZORENJE [ocjene.txt, redak " + brojRetka
                            + "]: ocjena nije broj -> preskačem: " + redak);
                    return null;
                }

                if (ocjena < 1 || ocjena > 5) {
                    System.out.println("UPOZORENJE [ocjene.txt, redak " + brojRetka
                            + "]: ocjena mora biti 1-5, pronađeno " + ocjena
                            + " -> preskačem: " + redak);
                    return null;
                }

                Predmet predmet = switch (kategorija) {
                    case "OBVEZNI" -> new ObvezniPredmet(ECTS,naziv,semestar);
                    case "IZBORNI" -> new IzborniPredmet(ECTS,naziv,semestar);
                    case "STRANI_JEZIK" -> new StraniJezikPredmet(ECTS,naziv,semestar);
                    case "SEMINAR" -> new SeminarskiRad(ECTS,naziv,semestar);
                    default -> {
                        System.out.println("UPOZORENJE [ocjene.txt, redak " + brojRetka
                                + "]: nepoznata kategorija '" + kategorija
                                + "' -> preskačem: " + redak);
                        yield null;
                    }
                };

                if (predmet == null) return null;

                return  new RezultatParsiranja(JMBAG, ocjena, predmet );

            }

        }

        ParserRetkaOcijena parser = new ParserRetkaOcijena();

        try (Scanner sc = new Scanner(new File(putanja))){
            int brojRetka= 0;

            while (sc.hasNextLine()) {
                String redak = sc.nextLine();
                brojRetka++;
                if (redak.isBlank()) continue;

                ParserRetkaOcijena.RezultatParsiranja r = parser.parsiraj(redak, brojRetka);

                if (r == null) continue;

                Student student = evidencija.nadjiStudenta(r.JMBAG);
                if (student == null){
                    System.out.println("UPOZORENJE [ocjene.txt, redak " + brojRetka
                            + "]: JMBAG " + r.JMBAG + " ne postoji u evidenciji -> preskačem");
                    continue;
                }
                evidencija.dodajOcjenu(student, r.predmet, r.ocjena);

            }

        } catch (FileNotFoundException e) {
            System.out.println("Greška Ne mogu otvoriti datoteku" + putanja);
        }

    }
}
