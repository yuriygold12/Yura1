package lesson_22;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writefile implements IWrite {
    public void writeInformation(String line) {
        FileWriter fileWriter = null;
        String filePath = "testTxtfile.txt";
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не можливо оновити дані у файлі через те що у незнайдено файл");
        }

        try {
            bufferedWriter = new BufferedWriter(fileWriter);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Не вийде запустити буфер");
        }

        try {
            bufferedWriter.write(line, 1, line.length() - 1);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Не записуем у файл");
        }

        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
