package HomeWorkPatternWorkWithBusStation;

public class BuyAbusMersedes extends BusStantion {
    @Override
    public Transportable buyAbus() {
        return new BusMersedes();
    }
}
