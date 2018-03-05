package lesson_22;
import java.io.File;
import java.io.IOException;


public class FileReader implements IRead {

    @Override
    public String readInformation() throws IOException {
       // Scanner sc = new Scanner(System.in);
        //System.out.println("Please enetr your info11q:");
        //String ob = sc.nextLine();
        File file1 = new File("D:\\yura.txt");
        java.io.FileReader fi = new java.io.FileReader(file1);
        char a []= new char[4];
        fi.read(a,0,4);
        fi.close();

        String ob = "dsf";
        return ob;
    }
}
