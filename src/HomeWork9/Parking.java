package HomeWork9;

public class Parking {
    private String addresParking;
    private Driver[]drivers;
    private int parkinglotnumber;
    private int priceParking;


    public Parking() {
        this.addresParking = "Trulovskogo";
        this.drivers = null;
        this.parkinglotnumber = 0;
        this.priceParking = 0;
    }

    public Parking(String addresParking, Driver[] drivers, int parkinglotnumber, int priceParking) {
        this.addresParking = addresParking;
        this.drivers = drivers;
        this.parkinglotnumber = parkinglotnumber;
        this.priceParking = priceParking;
    }

    public String getAddresParking() {
        return addresParking;
    }

    public void setAddresParking(String addresParking) {
        this.addresParking = addresParking;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
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
}
