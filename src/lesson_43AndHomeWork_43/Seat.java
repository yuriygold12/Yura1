package lesson_43AndHomeWork_43;

public class Seat implements Comparable<Seat> {
    private final String number;
    private boolean isReserved = false;

    public Seat(String number) {
        this.number = number;
    }

    public Seat() {
        number = "fsfs";
    }

    public boolean reserv() {
        if (!this.isReserved) {
            System.out.println("Seat " + number + " is reserved");
            this.isReserved = true;
            return true;
        } else {
            System.out.println("This seat " + number + "is already reserved");
            return false;
        }
    }

    public boolean cancel() {
        if (isReserved) {
            this.isReserved = false;
            System.out.println("Reservetiion for " + number + "is cancel");
            return true;
        } else {
            System.out.println("This is place isn't reserved because not cancel");
            return false;
        }
    }

    public String getNumber() {
        return number;
    }

    @Override
    public int compareTo(Seat seat) {
        return this.number.compareToIgnoreCase(seat.getNumber());
    }
}
