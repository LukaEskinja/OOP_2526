package pckg_array_one;

import java.util.concurrent.ThreadLocalRandom;

public class AUC_CLS {

    private static int ORIGIN = 0;

    private static int BOUND = 250;

    public static int[] genIntArray(int numElements){



        int[] array = new int[numElements];
        for(int k = 0; k < numElements; k++){
            array[k] = ThreadLocalRandom.current().nextInt(ORIGIN, BOUND);


        }
        return array;
    }

    public static Student[] genStudentsFromName(String[] names){
        Student[] students = new Student[names.length];
        for(int i = 0; i < names.length; i++){
            students[i] = new Student(names[i]);
        }

        return students;
    }

    public static <E> void printElementsFromARrr(E[] arr){
        for(E element : arr){
            System.out.println(element);
        }
    }

    public static void printIntFromArray(int[] intArr){
        for(int el : intArr){
            System.out.println(el);
        }
    }

    public static void printStrFromArr(String[] strArr){
        for(String el : strArr){
            System.out.println(el);
        }
    }

    public static void printStudentFromArr(Student[] stud){
        for(Student st : stud){
            System.out.println(st);
        }

    }

    public static Profesor[] genProfesorFromName(String[] prNames){
        Profesor[] profesors = new Profesor[prNames.length];
        for(int i = 0; i < prNames.length; i++){
            profesors[i] = new Profesor(prNames[i]);
        }

        return profesors;
    }
}

