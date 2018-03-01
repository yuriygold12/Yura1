package HomeWorkPattersInformationExpert;

import java.util.ArrayList;

public class CashRegister {

    private static ArrayList<Sale> sales = new ArrayList<>();

    public static void addCheck(Sale sale) {
        if (sale != null) // Ось тут я так і не докінця поняв як мені правльно зробити я поняв проблему не поняв як іі вирішити(((
        {
            sales.add(sale);
        } else {
            System.out.println("not the check");
        }
    }

    public static Sale searchCeck(Sale sale) {
        if (sale != null && sales != null) {
            int count = 0;
            Sale sale2 = new Sale();
            for (Sale cech : sales) {
                if (cech.equals(sale)) {
                    ++count;
                    sale2 = cech;
                    return sale2;
                }
            }
            if (count == 0) {
                System.out.println("Не знайдено чеку");
            }
        } else {
            System.out.println("Немае чеків");
        }
        return null;//Ось тут недоганяю
    }

    public static void showCheck(Sale sale) {
        for (Sale ceck : sales) {
            if (ceck.equals(sale)) {
                ceck.showinfo();
            }
        }
    }


    public static void showinfo() {
        for (Sale i : sales) {
            i.showinfo();
        }
    }
}
