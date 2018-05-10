package HomeWork40;

import java.util.ArrayList;

public class Stock<T extends Box> {

    private ArrayList<T> parcels = new ArrayList<>();

    public Stock(ArrayList<T> parcels) {
        this.parcels = parcels;
    }


    public ArrayList<T> getParcels() {
        return parcels;
    }
}
