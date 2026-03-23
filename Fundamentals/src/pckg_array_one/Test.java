package pckg_array_one;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] arrInt = AUC_CLS.genIntArray(10);
        System.out.println(Arrays.toString(arrInt));
        String [] someStrings = {"String1", "Novi", "Treći", "Tako dalje", "Finalni"};
        String [] anotherStr;
        String [] newString = new String[7];
        anotherStr = newString;
        printStringArrayElements(someStrings);
        System.out.println("------------------");
        printStringArrayElements(anotherStr);
        anotherStr = someStrings;
        System.out.println(anotherStr.length);
        System.out.println(anotherStr);
        anotherStr = newString;
        System.out.println(newString);
        System.out.println(newString.length);

    }

    private static void printStringArrayElements(String[] arr){
        for(String el : arr){
            System.out.println(el);
        }
    }

    Student[] studenti = new Student[10];
    Student[] studenti2 = {new Student("Marko"),new Student("Ivana"),new Student("Petra")};



}
