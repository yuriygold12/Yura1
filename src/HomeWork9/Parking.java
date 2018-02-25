package HomeWork9;

import java.util.ArrayList;

public class Parking {
    private String addresParking;
    private ArrayList <Driver> drivers;
    private int parkinglotnumber;
    private int priceParking;

    public Parking() {
        this.addresParking = "Trulovskogo";
        this.drivers = new ArrayList<Driver>();
        this.parkinglotnumber = 0;
        this.priceParking = 0;
    }

    public Parking(String addresParking, ArrayList<Driver> drivers, int parkinglotnumber, int priceParking) {
        this.addresParking = addresParking;
        this.drivers = new ArrayList<>(drivers);
        this.parkinglotnumber = parkinglotnumber;
        this.priceParking = priceParking;
    }

    public String getAddresParking() {
        return addresParking;
    }

    public void setAddresParking(String addresParking) {
        this.addresParking = addresParking;
    }

    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public int getParkinglotnumber() {
        return parkinglotnumber;
    }

    public void setParkinglotnumber(int parkinglotnumber) {
        this.parkinglotnumber = parkinglotnumber;
    }

    public int getPriceParking() {
        return priceParking;
    }

    public void setPriceParking(int priceParking) {
        this.priceParking = priceParking;
    }

    public void showinfo()
    {
        System.out.println("Адреса Парковки: "+addresParking);
        System.out.println("Вивід водіїв: "+drivers);
        System.out.println("номер місця: "+priceParking);
        System.out.println("Ціна парковки: "+priceParking);
    }
}
