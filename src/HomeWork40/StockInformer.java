package HomeWork40;

import java.util.ArrayList;

public class StockInformer {
    public static void showBoxInfo(Stock<? extends Box> ob) {
        for (Box item : ob.getStaff()) {
            System.out.println("Width: " + item.getWidth());
            System.out.println("Height: " + item.getHeight());
            System.out.println("Depht: " + item.getDepht());
        }
    }

    public static void showInfoPostbox(Stock<? extends PostBox> ob) {

        for (PostBox item : ob.getStaff()) {
            System.out.println("Id: " + item.getId());
            System.out.println("Weight:" + item.getWeight());
        }
    }

    public static void showInfoParcel(Stock<? extends Parcel> ob) {
        for (Parcel item : ob.getStaff()) {
            System.out.println("Client" + item.getClient());
        }
    }
}
