package HomeWorkPatternWorkWithBusStation;

public class BuyAbusEtalon extends BusStantion {
    @Override
    public Transportable buyAbus() {
        return new BusEtalon();
    }
}
