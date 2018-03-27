package lesson28;

public class DoveLogistic extends DeliveryLogstic {
    public Transport useTransport() {
        return new Dove();
    }
}
