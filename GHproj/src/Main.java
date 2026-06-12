import pckg_evidencija.*;
import pckg_model.Student;
import pckg_util.CitacPodataka;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("Mateo","Luka",2011,"0036500715","Informatika","mail");
        Student st2 = new Student("marko","Mirko",2012,"0036507115","Matematika","mail");
        Student st3 = new Student("Miroko","Marin",2013,"0236700115","Geografija","mail");
        Student st4 = new Student("Martin","Mateo",2014,"0136500715","Njemački","mail");

        Predmet geo = new ObvezniPredmet(6,"gegrafija","prvi");
        Predmet mat1 = new ObvezniPredmet(7, "Matematika I","prvi");
        Predmet engleski = new StraniJezikPredmet(3, "Engleski jezik","prvi");
        Predmet web = new IzborniPredmet(4, "Web tehnologije","drugi");

        StudentskaEvidencija se1 = new StudentskaEvidencija();


        se1.dodajStudenta(st2);
        se1.dodajStudenta(st1);
        se1.dodajStudenta(st3);
        se1.dodajStudenta(st4);

        se1.dodajOcjenu(st1, geo, 5);
        se1.dodajOcjenu(st1, mat1, 4);
        se1.dodajOcjenu(st1, engleski, 5);
        se1.dodajOcjenu(st1, web, 5);

        se1.dodajOcjenu(st2, web, 3);
        se1.dodajOcjenu(st2, mat1, 2);
        se1.dodajOcjenu(st2, engleski, 1);

        se1.dodajOcjenu(st3, web, 5);
        se1.dodajOcjenu(st3, mat1, 5);
        se1.dodajOcjenu(st3, engleski, 4);

        se1.dodajOcjenu(st4, engleski, 3);
        se1.dodajOcjenu(st4, mat1, 4);
        se1.dodajOcjenu(st4, web, 5);


        CitacPodataka cp1 = new CitacPodataka();
        cp1.ucitajStudente("C:/Users/Luka/Documents/SIT/Semestar2/Oop/Predavanje3/OOP_2526/GHproj/DATA/studenti.txt", se1);
        System.out.println("Ucitano studenata: " + se1.brojStudenata());
        cp1.ucitajOcjene("DATA/ocjene.txt", se1);

        System.out.println("=== STUDENTI PO JMBAG-U (iz datoteke i rucno)===");
        for (Student s : se1.dajStudente()) {
            System.out.println(s.generirajIzvjestaj());

        }

        List<Student> rangLista = new ArrayList<>();
        for (Student s : se1.dajStudente()) {
            rangLista.add(s);
        }

        Comparator<Student> poProsijeku = (stu1,stu2) -> {
            double p1 = se1.dajStatistiku(stu1).prosjekOcjena();
            double p2 = se1.dajStatistiku(stu2).prosjekOcjena();
            return Double.compare(p2,p1);
        };

        rangLista.sort(poProsijeku);

        System.out.println("\n=== RANG LISTA PO PROSIJEKU ===");
        int rang = 1;

        for (Student s : rangLista) {
            double prosjek = se1.dajStatistiku(s).prosjekOcjena();
            System.out.printf("%d, %s, %s - prosjek: %.2f%n", rang++, s.getIme(),s.getPrezime(),prosjek);
        }

        System.out.println("\n=== DETALJNI IZVJEŠTAJI ===");

        for (Student s : se1.dajStudente()){
            StudentskaEvidencija.StatistikaStudenta stat = se1.dajStatistiku(s);
            System.out.println(stat.generirajIzvjestaj());
            System.out.println("---");
        }
        System.out.println("\nUkupno studenata " + se1.brojStudenata());

        List<Student> informaticari = se1.dajStudenteStudija("Informatika");

                System.out.println("=== STUDENTI INFORMATIKE ===");
        for (Student s : informaticari) {
            System.out.println(s.generirajIzvjestaj());
        }

        System.out.println("Working dir: " + System.getProperty("user.dir"));
    }

}
