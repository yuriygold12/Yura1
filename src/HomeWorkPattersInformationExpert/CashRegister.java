package HomeWorkPattersInformationExpert;

import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {

    private static ArrayList<Sale> sales = new ArrayList<>();

    public static void addCheck(Sale sale) {
        if (CashRegister.VerifitiSale(sale)) {
            sales.add(sale);
        } else {
            System.out.println("not the check");
        }
    }


    public static boolean VerifitiSale(Sale sale1) {
        if (sale1.VerifytyItems()) {
            return true;
        }
        return false;
    }


    public static void CreatNewSale() {
        Sale sale1 = new Sale();
        sale1.addSaleLineItem();
        sales.add(sale1);
    }


    public static Sale searchCeck(Sale sale) {
        Sale sale2 = null;
        if (CashRegister.VerifitiSale(sale) && (!sales.isEmpty())) {
            int count = 0;
            for (Sale cech : sales) {
                if (cech.equals(sale)) {
                    count++;
                    sale2 = cech;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Не знайдено чеку");
            }
        } else {
            System.out.println("Немае чеків");
        }
        return sale2;
    }


    public static void showCheck(Sale sale) {
        if (CashRegister.VerifitiSale(sale)) {
            for (Sale ceck : sales) {
                if (ceck.equals(sale)) {
                    ceck.showSale();
                    break;
                }
            }
        }
    }


    public static void showCashRegisterCheking() {
        if (!sales.isEmpty()) {
            System.out.println("Чек: ");
            for (Sale i : sales) {
                i.showSale();
            }
        } else {
            System.out.println("Немає покупки(((");
        }
    }
}


