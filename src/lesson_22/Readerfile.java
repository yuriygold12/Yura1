package lesson_22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Readerfile implements IRead {
    public String readInformation() throws IOException {
        String filePath = "D:/yura.txt";
        String objedsrticka = null;
        BufferedReader bufferedReader = null;
        ArrayList<String> stricka = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            while ((objedsrticka = bufferedReader.readLine()) != null) {
             stricka.add(objedsrticka);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Не вдалося знайти файл або відкрити потік");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Помилка якщо не вдалося зчитати із файлу");
        }
        //String ob2 = bufferedReader.lines().toString();
        //System.out.println(ob2);
        System.out.println(stricka.toString());
        return stricka.toString();
    }
}
