package lesson_43;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String name;
    private List<Seat> seats = new ArrayList<>();

    public Hall(String name, int rows, int seatsPerRows) {
        this.name = name;
        int lastRow = 'A' + (rows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 0; seatNumber <= seatsPerRows; seatNumber++) {
                Seat seat = new Seat(row + String.format("%02d", seatNumber));
                seats.add(seat);
            }
        }
    }

    public void showSeats() {
        for (Seat item : seats) {
            System.out.println(item.getNumber());
        }
    }

    /*public boolean reservSeat(String number) {
        Seat reqestedSeat = null;
        for (Seat item : seats) {
            System.out.println("[*]");
            if (item.getNumber().equals(number)) {
                reqestedSeat = item;
                break;
            }
        }
        if (reqestedSeat == null) {
            System.out.println("Sorry not cannot find place  with number " + number);
            return false;
        }
        return reqestedSeat.reserv();
    }

    public boolean canceleSeat(String number) {
        Seat reqestedSeat = null;
        for (Seat item : seats) {
            System.out.println("[*]");
            if (item.getNumber().equals(number)) {
                reqestedSeat = item;
                break;
            }
        }
        if (reqestedSeat == null) {
            System.out.println("Sorry not cannot find place  with number " + number);
            return false;
        }
        return reqestedSeat.cancel();
    }

    public boolean reservSeat(String number) {
        Seat reqestedSeat = new Seat(number);
        int foundSeat = Collections.binarySearch(seats, reqestedSeat, null);
        if (foundSeat >= 0) {
            return reqestedSeat.reserv();
        } else {
            System.out.println("Sorry not cannot find place  with number " + number);
            return false;
        }
    }

    public boolean cancelSeat(String number) {
        Seat reqestedSeat = new Seat(number);
        int foundSeat = Collections.binarySearch(seats, reqestedSeat, null);
        if (foundSeat >= 0) {
            return reqestedSeat.cancel();
        } else {
            System.out.println("Sorry not cannot find place  with number " + number);
            return false;
        }
    }*/

    public boolean reservSeat(String number) {
        Seat reqestedSeat = null;
        int r = seats.size() - 1;
        int l = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (seats.get(m).getNumber().equals(number)) {
                reqestedSeat = seats.get(m);
                return reqestedSeat.reserv();
            }
            //System.out.println(seats.get(m).getNumber());
            System.out.println("[*]");
            Seat a = seats.get(m);
            String value = a.getNumber();
            if (value.compareTo(number) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }

    public boolean cancelSeat(String number) {
        Seat reqestedSeat = null;
        int r = seats.size() - 1;
        int l = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (seats.get(m).getNumber().equals(number)) {
                reqestedSeat = seats.get(m);
                return reqestedSeat.cancel();
            }
            //System.out.println(seats.get(m).getNumber());
            System.out.println("[*]");
            Seat a = seats.get(m);
            String value = a.getNumber();
            if (value.compareTo(number) < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return false;
    }
}