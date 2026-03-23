package pckg_array_one;

public class MainApp {
    public static void main(String[] args) {
        String[] names = {"Stjepan", "Marija", "Ivana", "Branko","Tihana"};
        String[] prNames = {"Ante", "Tome", "Marko","Marin","Branko"};
        Student[] students = AUC_CLS.genStudentsFromName(names);
        AUC_CLS.printStudentFromArr(students);
        System.out.println("----------------------------------");
        AUC_CLS.printElementsFromARrr(students);
        Profesor[] profesors = AUC_CLS.genProfesorFromName(prNames);
        AUC_CLS.printElementsFromARrr(profesors);
    }
}
