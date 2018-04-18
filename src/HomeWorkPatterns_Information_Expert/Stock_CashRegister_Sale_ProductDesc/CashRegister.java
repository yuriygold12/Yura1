package HomeWorkPatterns_Information_Expert.Stock_CashRegister_Sale_ProductDesc;

import java.util.ArrayList;

public class CashRegister {

    private static ArrayList<Sale> sales = new ArrayList<>();

    public static void addCheck(Sale sale) {
        if (CashRegister.VerifitiSale(sale)) {
            sales.add(sale);
        } else {
            System.out.println("Немає зформованоі покупки тому не додаем чек у касовий апарат");
        }
    }


    public static boolean VerifitiSale(Sale sale) {
        if (sale.VerifytyItems()) {
            return true;
        }
        return false;
    }


    public static void CreatNewSale() {
        Sale sale = new Sale();
        sale.addSaleLineItem();
        sales.add(sale);
    }


    public static Sale searchCheck(Sale sale) {
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
            System.out.println("Немае чеків у касовому апараті або переданий чек для пошуку не праіильний");
        }
        return sale2;
    }


    public static void showCheck(Sale sale) {
        if (CashRegister.VerifitiSale(sale) && (!sales.isEmpty())) {
            for (Sale ceck : sales) {
                if (ceck.equals(sale)) {
                    ceck.showSale();
                    break;
                }
            }
        } else {
            System.out.println("Не знайшлося чеку який ви хотіли вивести або переданий вами чек не справний");
        }
    }


    public static void showCashRegisterCheking() {
        if (!sales.isEmpty()) {
            System.out.println("Касовий апарат: ");
            for (Sale i : sales) {
                System.out.println("Чек номер: "+ i);
                i.showSale();
            }
        } else {
            System.out.println("Немає покупки і відносно немає чеків");
        }
    }
}


