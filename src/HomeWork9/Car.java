package HomeWork9;

public class Car {
    private  int numberofSteatsthecar;
    private  String Marka;
    private  String Model;
    private  Color color1;


    public Car(){
        this.numberofSteatsthecar = 123456;
        this.Marka = "bmv";
        this.Model = "x5";
        this.color1 = Color.red;
    }


    public Car(int numberofSteatsthecar, String marka, String model, Color color) {
        this.numberofSteatsthecar = numberofSteatsthecar;
        this.Marka = marka;
        this.Model = model;
        this.color1 = color;
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

    public Color getColor() {
        return color1;
    }

    public void setColor(Color color){
        this.color1 = color;
    }

    public void ShowCar()
    {
        System.out.println("Number Car == "+numberofSteatsthecar);
        System.out.println("Marka == "+Marka);
        System.out.println("MOdel == "+Model);
        System.out.println("Color == "+color1.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberofSteatsthecar=" + numberofSteatsthecar +
               ", Marka='" + Marka + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + color1 + '\'' +
                '}';
    }
}
