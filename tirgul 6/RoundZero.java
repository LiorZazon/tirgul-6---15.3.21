package com.company;

public class RoundZero {

    public static int roundUp(int num){
        if (num == 0){
            return 0;
        }
        else {
            return num+1;
        }

    }

    public static int roundDown(int num){
        if (num == 1){
            return 1;
        }
        else {
            return num-1;
        }
    }

      // public static void round(int num) {
     //   if (num > 0.5) {
     //       System.out.println(roundUp((int) 0.5));
     //   }

    //    if (roundUp())
   // }

}
