package lesson28;

public abstract class DeliveryLogstic {
    public abstract Transport useTransport();
    public void planDelivery() {
        Transport transport = useTransport();
        transport.deliverMail();
    }
}
