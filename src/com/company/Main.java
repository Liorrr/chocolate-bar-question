package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	//
        birthdaySplit(2,6);

    }

    public static void birthdaySplit (int a, int b){
        int[] choco = createChocoBar();
        System.out.println(Arrays.toString(choco));

        for (int i = 0; i < ((choco.length-a)+1); i++){
            int sum = 0;
            int counter = 0;
            for (int z = i; counter < a; z++){
                sum += choco[z];
                counter++;
            }
            if (sum == b){
                int counter2 = 0;
                for (int z = i; counter2 < a; z++){
                    System.out.print(choco[z]+ ",");
                    counter2++;
                }
                System.out.println();
            }
        }


    }

    public static int[] createChocoBar (){
        Random random = new Random();
        int[] chocolateBar = new int[60];
        for (int i = 0; i < chocolateBar.length; i++){
            if (chocolateBar[i] == 0){
                chocolateBar[i] = (random.nextInt(31)+1);
            }

        }
        //System.out.println(Arrays.toString(chocolateBar));
        return chocolateBar;
    }

}




