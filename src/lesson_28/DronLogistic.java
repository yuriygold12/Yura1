package lesson_28;

public class DronLogistic extends DeliveryLogstic {
    public Transport useTransport() {
        return new Drone();
    }
}
