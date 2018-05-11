package HomeWork39;

import java.util.Scanner;

public class IntegerNumbers extends WorkwithGenerick<Integer> {
    @Override
    public void insertIntoSort() {
        Integer temp;
        int j;
        int length = numbersList.size();
        for (int i = 0; i < length - 1; i++) {
            if (numbersList.get(i).doubleValue() > numbersList.get(i + 1).doubleValue()) {
                Integer temp1 = numbersList.get(i + 1);
                numbersList.set(i + 1, numbersList.get(i));
                j = i;
                while (j > 0 && temp1.doubleValue() < numbersList.get(j - 1).doubleValue()) {
                    numbersList.set(j, numbersList.get(j - 1));
                    j--;
                }
                numbersList.set(j, temp1);
            }
        }
    }

    @Override
    public void addElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        Integer someNumber = sc.nextInt();
        numbersList.add(someNumber);
    }
}
