package pckg_arr_2;

import pckg_array_one.AUC_CLS;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArrPomocna {

    public static Float[] getUserDefinedTemp(Scanner scanner, int numElements) {
        Float[] temps = new Float[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.println("Unesite temperaturu:\t");
            temps[i] = scanner.nextFloat();

        }
        return temps;
    }

    public static Float[] getRandomTemp(int numTemps){
        Float MAXI = 39f;
        Float MINI = -10f;
        Float[] temps = new Float[numTemps];
        for(int k = 0; k < numTemps; k++){
            temps[k]= ThreadLocalRandom.current().nextFloat(MINI,MAXI);
        }
        return null;
    }
    public static Float avgTemp(Float[] temps){
        float acumSum = 0;
        for(float el : temps){
            acumSum += el;
        }
        return acumSum/temps.length;
    }

    public static void aboveBelow(Float[] temps){
        int above = 0;
        int below = 0;
        int eq = 0;

        float avg = avgTemp(temps);
        for(float el : temps){
            if (el > avg) {
                above ++;
            }
            if(el < avg){
                below ++;
            }
            else {
                eq++;
            }
            AUC_CLS.printElementsFromARrr(temps);
            System.out.println("------------------------------------------");
            System.out.println("Avg temp:"+ avg);
            System.out.println("Above avg temp:"+ above);
            System.out.println("Below avg temp:"+ below);
            System.out.println("Equal to avg:" + eq);
        }
    }
}
