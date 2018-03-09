package HomeWork23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayIndexExaption {

    private int ar[];
    private int size;


    public ArrayIndexExaption() {
        this.ar = null;
        this.size = 0;
    }

    public void size() {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        do {
            try {

                System.out.println("Введіть сайз масиву: ");
                size = sc.nextInt();
                ar = new int[size];
                break;
            } catch (NegativeArraySizeException e) {
                System.out.println("Результат : " + e.getMessage());
                System.out.println("Не вірно введено кількість елементів у масив");
            }

            catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                sc1.nextLine();
            }
        } while (true);
        System.out.println("Кількість елементів масиву : " + size);
    }



    public void index() {
        do {
            Scanner sc = new Scanner(System.in);
            try {
                for (int i = 0; i < size; i++) {
                    ar[i] = 113;
                }
                System.out.println("Введіть індекс в який ви бажаете замінити елемент: ");
                int index = sc.nextInt();
                ar[index] = 12;
                System.out.println("Під цим індексом додато: " + index);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Причина: " + e.getMessage());
                System.out.println("Деякий Індекс вийшов за придел масиву");
            } catch (InputMismatchException e) {
                System.out.println("Введено недопустимий символ :" + e.getMessage());
                Scanner sc1 = new Scanner(System.in);
                sc1.nextLine();
            }
        }while(true);
    }

    public static void main(String[] args) {
        ArrayIndexExaption arrayIndexExaption = new ArrayIndexExaption();
        arrayIndexExaption.size();
        arrayIndexExaption.index();
    }
}
