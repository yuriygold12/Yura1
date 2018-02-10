package lesson15;

import MyPack.Person;

import java.util.LinkedList;
import java.util.Random;

public class SortingRunner {
    public static void main(String[] args) {

        int numbers[] = new int [100000];
        Random random = new Random();
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = random.nextInt(20000);

        }

       /* TImer ob = new TImer();
        ob.startTime();
        Sorting.bubbleSort(numbers);
        ob.finishTime();
        System.out.println("Resaults: "+ob.resutsTime());
        //System.out.println("sadasdas"+ob.getFinishTime());
        //System.out.println("sadasdas"+ob.getStartTime());
        //System.out.println("sadasdas"+ob.getResault());
        //Sorting.showArray(numbers);*/

        TImer ob1 = new TImer();
        ob1.startTime();
        Sorting.quickSort(numbers,0,numbers.length-1);
      //  Sorting.quickSort(numbers,0,50);
        //Sorting.quickSort(numbers,0,50);
        //Sorting.quickSort(numbers,0,50);
        //Sorting.quickSort(numbers,0,50);
       // Sorting.quickSort(numbers,0,50);
       // Sorting.quickSort(numbers,0,50);
       // Sorting.quickSort(numbers,0,50);
      //  Sorting.quickSort(numbers,0,50);
       // Sorting.quickSort(numbers,0,50);
       // Sorting.quickSort(numbers,0,50);
        //Sorting.quickSort(numbers,0,50);
       // Sorting.showArrayQuicksorting(numbers,0,30);
        ob1.finishTime();
        long resuts = ob1.resutsTime();
        System.out.println("Resaults: "+ resuts);


       // System.out.println("sadasdas"+ob1.getFinishTime());
        //System.out.println("sadasdas"+ob1.getStartTime());
       // System.out.println("sadasdas"+ob1.getResault());
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Continue
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        int couter = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " ");
            } else {
                continue;
            }
            couter++;
        }
        System.out.println("Counter :"+couter);
        */
    }
}
