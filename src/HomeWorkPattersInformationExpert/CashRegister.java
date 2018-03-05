package HomeWorkPattersInformationExpert;
import java.util.ArrayList;
import java.util.Scanner;

public class CashRegister {

    private static ArrayList<Sale> sales = new ArrayList<>();

    public static void addCheck(Sale sale) {
        if (sale != null)
        {
            sales.add(sale);
        } else {
            System.out.println("not the check");
        }
    }
//11
    public static void CreatNewSale()
    {
        Sale sale1 = new Sale();
        sale1.addSaleLineItem();
        sales.add(sale1);
    }

    public static Sale searchCeck(Sale sale) {
        Sale sale2 = null;
        if (sale != null && sales != null) {
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
        for (Sale ceck : sales) {
            if (ceck.equals(sale)) {
                ceck.showSale();
                break;
            }
        }
    }

    public static void showCashRegisterCheking() {
        for (Sale i : sales) {
            i.showSale();
        }
    }
}


