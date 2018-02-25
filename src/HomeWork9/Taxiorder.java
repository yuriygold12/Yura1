package HomeWork9;

public class Taxiorder {
    private int id;
    private Client client;
    private int priceofthetrip;
    private String placeofDeparture;
    private String placeofarrival;
    private Payment paiment;
    private Driver Driver;

    public Taxiorder() {
        this.id = 0;
        this.client = null;
        this.priceofthetrip = 12;
        this.placeofDeparture = "Antonuca";
        this.placeofarrival = "trylovskogo";
        this.paiment = null;
        Driver = null;
    }

    public Taxiorder(int id, Client client, int priceofthetrip, String placeofDeparture, String placeofarrival,
                     Payment paiment, Driver driver) {
        this.id = id;
        this.client = client;
        this.priceofthetrip = priceofthetrip;
        this.placeofDeparture = placeofDeparture;
        this.placeofarrival = placeofarrival;
        this.paiment = paiment;
        this.Driver = driver;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getPriceofthetrip() {
        return priceofthetrip;
    }

    public void setPriceofthetrip(int priceofthetrip) {
        this.priceofthetrip = priceofthetrip;
    }

    public String getPlaceofDeparture() {
        return placeofDeparture;
    }

    public void setPlaceofDeparture(String placeofDeparture) {
        this.placeofDeparture = placeofDeparture;
    }

    public String getPlaceofarrival() {
        return placeofarrival;
    }

    public void setPlaceofarrival(String placeofarrival) {
        this.placeofarrival = placeofarrival;
    }

    public Payment getPaiment() {
        return paiment;
    }

    public void setPaiment(Payment paiment) {
        this.paiment = paiment;
    }

    public Driver getDriver() {
        return Driver;
    }

    public void setDriver(Driver driver) {
        Driver = driver;
    }

    public void showTaxiOrder()
    {
        System.out.println("id =="+id);
        System.out.println("Кліент == "+client);
        System.out.println("Ціна"+priceofthetrip);
        System.out.println("Антонича == "+placeofDeparture);
        System.out.println("Трильовського == "+placeofarrival);
        System.out.println("Оплата == "+paiment);
        System.out.println("Водій == "+Driver);
    }

    @Override
    public String toString() {
        return "Taxiorder{" +
                "id=" + id +
                ", client=" + client +
                ", priceofthetrip=" + priceofthetrip +
                ", placeofDeparture='" + placeofDeparture + '\'' +
                ", placeofarrival='" + placeofarrival + '\'' +
                ", paiment=" + paiment +
                ", Driver=" + Driver +
                '}';
    }
}
