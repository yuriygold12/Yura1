package lesson_23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class lesson_23_1 {
    public static void main(String[] args) {
       someFunct();
    }

    public static void someFunct() {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            System.out.print("d = ");
            try {
                int d = sc.nextInt();
                a = 50 / d;
                break;
            } catch(InputMismatchException e) {
                System.out.println("Введено недопустимий символ :"+e.getMessage());
                sc.nextLine();

            }catch (Exception e) {
                System.out.println("Помилка введення :"+e.getMessage());
                System.out.println("Спробуйте ще раз");
                //e.printStackTrace();
            }

        } while (true);
        System.out.println("a = " + a);
    }

}


/*
try/catch
try/catch/catch
try/catch/finaly
throw new Exception()
throws
 */
