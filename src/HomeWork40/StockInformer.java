package HomeWork40;

import java.util.ArrayList;

public class StockInformer {
    public static void showinfoBoxOrOther(Stock<?> ob) {
        ArrayList<Object> parcels = new ArrayList<Object>(ob.getParcels());
        for (Object item : parcels) {
            System.out.println(item.toString());
        }
    }

    public static void showInfoOthersPostboxOrOther(Stock<? extends PostBox> ob) {
        ArrayList<Object> parcels = new ArrayList<Object>(ob.getParcels());
        for (Object item : parcels) {
            System.out.println(item.toString());
        }
    }

    public static void showInfoParcel(Stock<? extends Parcel> ob) {
        ArrayList<Object> parcels = new ArrayList<Object>(ob.getParcels());
        for (Object item : parcels) {
            System.out.println(item.toString());
        }
    }
}
