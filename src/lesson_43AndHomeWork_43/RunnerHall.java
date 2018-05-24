package lesson_43AndHomeWork_43;

public class RunnerHall {
    public static void main(String[] args) {
        Hall hall = new Hall("Dovwenka", 5, 5);
        hall.showSeats();
        System.out.println("Reserved");
        hall.reservSeat("D04");
        hall.reservSeat("D04");
        hall.reservSeat("A04");
        hall.reservSeat("A04");
        hall.cancelSeat("A01");
        hall.cancelSeat("A03");
    }
}
