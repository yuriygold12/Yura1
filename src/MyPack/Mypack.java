package MyPack;

public class Mypack  {
   public String name;
   public double bal;


    public Mypack(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

    public void show()
    {
        if(bal < 0)
        {
            System.out.println("-->");

        }
        else
        {
            System.out.println(name + ": S"+bal);
        }
    }
}
