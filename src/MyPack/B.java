package MyPack;

public class B extends A implements  A.Neter{
    int a;
    int b;

        /* public void callback(int parametr){
             this.a = a * parametr;
             System.out.println("Метод визваний із класу Інтерфейс: "+a);
         }
*/

    public boolean isnoteraf(int x)
    {
        return x < 0 ? false : true;
    }




    public B(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public B() {
        this.a = 122;
        this.b = 2;
    }
}
