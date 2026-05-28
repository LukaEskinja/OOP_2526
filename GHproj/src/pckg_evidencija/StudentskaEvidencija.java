package pckg_evidencija;

import pckg_model.Student;

import java.util.*;

public class StudentskaEvidencija {

    private TreeMap<Student, Map<Predmet, Integer>> evidencija = new TreeMap<>();

    public void dodajStudenta(Student student) {
        evidencija.putIfAbsent(student, new LinkedHashMap<>());
    }

    public void dodajOcjenu(Student student, Predmet predmet, int ocjena) {
        if (!evidencija.containsKey(student)) {
            System.out.println("UPOZORENJE: Student" + student.getJMBAG() + "nije u evidenciji");
            return;
        }
        evidencija.get(student).put(predmet, ocjena);
    }

    public Iterable<Student> dajStudente() {
        return Collections.unmodifiableSet(evidencija.keySet());
    }
    public List<Student> dajStudenteStudija(String studij) {
        List<Student> rezultat = new ArrayList<>();

        for (Student s : evidencija.keySet()) {
            if (s.getStudij().equals(studij)) {
                rezultat.add(s);
            }
        }

        return rezultat;
    }

    public Student nadjiStudenta(String JMBAG) {
        for (Student s : evidencija.keySet()) {
            if (s.getJMBAG().equals(JMBAG)) return s;
        }
        return null;
    }

    public int brojStudenata() {
        return evidencija.size();
    }

    public StatistikaStudenta dajStatistiku(Student student) {
        return new StatistikaStudenta(student);
    }

    public class StatistikaStudenta {

        private Student student;

        public StatistikaStudenta(Student student) {
            this.student = student;
        }

        public int ukupniEcts() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);
            if (predmeti == null) return 0;

            int ukupno = 0;
            for (Map.Entry<Predmet, Integer> entry : predmeti.entrySet()) {
                ukupno += entry.getKey().dajEcts(entry.getValue());
            }
            return ukupno;
        }

        public double prosjekOcjena() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);
            if (predmeti == null) return 0.0;

            int suma = 0;
            int broj = 0;
            for (Map.Entry<Predmet, Integer> entry : predmeti.entrySet()) {
                Predmet p = entry.getKey();
                int ocjena = entry.getValue();
                if (p.ulaziUProsjek() && p.jePolozen(ocjena)) {
                    suma += ocjena;
                    broj++;
                }
            }
            return broj == 0 ? 0.0 : (double) suma / broj;
        }

        public int najvisaOcjena() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);
            if (predmeti == null || predmeti.isEmpty()) return 0;

            int max = 0;
            for (int ocjena : predmeti.values()) {
                if (ocjena > max) max = ocjena;
            }
            return max;
        }

        public int najnizaOcjena() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);
            if (predmeti == null || predmeti.isEmpty()) return 0;

            int min = 5;
            for (int ocjena : predmeti.values()) {
                if (ocjena < min) min = ocjena;
            }
            return min;
        }

        public int brojNepolozenih() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);
            if (predmeti == null) return 0;

            int broj = 0;
            for (Map.Entry<Predmet, Integer> entry : predmeti.entrySet()) {
                if (!entry.getKey().jePolozen(entry.getValue())) broj++;
            }
            return broj;
        }

        public String generirajIzvjestaj() {
            Map<Predmet, Integer> predmeti = evidencija.get(student);

            StringBuilder sb = new StringBuilder();
            sb.append("Student: ").append(student.getIme()).append(" ").append(student.getPrezime())
                    .append(" (").append(student.getJMBAG()).append(")\n");
            sb.append("Studij: ").append(student.getStudij()).append("\n");
            sb.append("email: ").append(student.getEmail()).append("\n");
            sb.append("Predmeti:\n");

            if (predmeti != null) {
                for (Map.Entry<Predmet, Integer> entry : predmeti.entrySet()) {
                    sb.append("  - ").append(entry.getKey().opisi(entry.getValue())).append(String.format("%n"));
                }

            }
            sb.append(String.format("Ostvareni ECTS: %d%n", ukupniEcts()));
            sb.append(String.format("Prosjek ocjena: %.2f%n", prosjekOcjena()));
            sb.append(String.format("Najviša ocjena: %d%n", najvisaOcjena()));
            sb.append(String.format("Najniža ocjena: %d%n", najnizaOcjena()));
            sb.append(String.format("Nepoloženih predmeta: %d", brojNepolozenih()));


            return sb.toString();


        }


    }
}
