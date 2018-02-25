package HomeWork8;
import java.util.Scanner;
public class Car {
    private  int numberofSteatsthecar;
    private  String Marka;
    private  String Model;
    private  String Color;


    public Car(){
        this.numberofSteatsthecar = 123456;
        this.Marka = "bmv";
        this.Model = "x5";
        this.Color = "bile";
    }


    public Car(int numberofSteatsthecar, String marka, String model, String color) {
        this.numberofSteatsthecar = numberofSteatsthecar;
        this.Marka = marka;
        this.Model = model;
        this.Color = color;
    }


    public int getNumberofSteatsthecar() {
        return numberofSteatsthecar;
    }

    public void setNumberofSteatsthecar(int numberofSteatsthecar) {
        this.numberofSteatsthecar = numberofSteatsthecar;
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

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}
