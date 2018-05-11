package HomeWork40;

import java.util.ArrayList;

public class StockInformer {
    public static void showBoxInfo(Stock<? extends Box> ob) {


        for (Box item : ob.getStaff()) {
            System.out.println("Width: " + item.getWidth());
        }
    }

    public static void showInfoOthersPostboxOrOther(Stock<? extends PostBox> ob) {
        ArrayList<Object> parcels = new ArrayList<Object>(ob.getStaff());
        for (Object item : parcels) {
            System.out.println(item.toString());
        }
    }

    public static void showInfoParcel(Stock<? extends Parcel> ob) {
        ArrayList<Object> parcels = new ArrayList<Object>(ob.getStaff());
        for (Object item : parcels) {
            System.out.println(item.toString());
        }
    }
}
