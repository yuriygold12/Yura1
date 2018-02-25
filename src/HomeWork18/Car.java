package HomeWork18;

import java.util.Objects;

public class Car {
    private String color;
    private String Marka;
    private String Model;
    private Fuel fuel;


    public Car(String color, String marka, String model, Fuel fuel) {
        this.color = color;
        this.Marka = marka;
        this.Model = model;
        this.fuel = fuel;
    }

    public Car() {
        this.color = "biluy";
        this.Marka = "bmw";
        this.Model = "t4";
        this.fuel = null;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) &&
                Objects.equals(Marka, car.Marka) &&
                Objects.equals(Model, car.Model) &&
                fuel == car.fuel;
    }

    @Override
    public int hashCode() {

        return Objects.hash(color, Marka, Model, fuel);
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", fuel=" + fuel +
                '}';
    }
}
