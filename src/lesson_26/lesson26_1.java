package lesson_26;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class lesson26_1 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //sc.nextLine();
        String filePath = "C:/Users/1/IdeaProjects/Yura/src/lesson_26/Users.txt";
        String tempLine;
        ArrayList<String> words = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((tempLine = bufferedReader.readLine()) != null) {
                String[] tempWords = tempLine.split(",");

                for (int i = 0; i < tempWords.length; i++) {
                    words.add(tempWords[i]);
                }
                //System.out.println(tempLine);
            }
            for (String word : words) {
                System.out.println(word);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + filePath + " not found");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error while reading data from file");
            e.printStackTrace();
        }


        /*
        //Дз 26  - Шифрування Цезаря.
        String[] alfabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"
                , "X", "Y", "Z"};
        String[] alfabet1 = new String[26];

        Scanner sc = new Scanner(System.in);

        int cluc;
        do {
            System.out.print("Введыть ключ: ");
            cluc = sc.nextInt();
            if (cluc < 0 || cluc > 26) {
                System.out.println("Не вірно введено ключ повторіть будь - ласка введення ключа");
            } else {
                System.out.println("Ключ введенно вірно далі відбуваеться шифрування");
            }
        } while (cluc < 0 || cluc > 26);
        for (int i = cluc, j = 0; i < alfabet.length && j < alfabet.length - cluc; i++, j++) {
            alfabet1[j] = alfabet[i];
        }
        for (int i = alfabet.length - cluc, j = 0; i < alfabet.length && j < cluc; i++, j++) {
            alfabet1[i] = alfabet[j];
        }
        System.out.println("До шифровання");
        for (int i = 0; i < alfabet1.length; i++) {
            System.out.println("litera: " + alfabet[i]);
        }
        System.out.println("Після шифровання");
        for (int i = 0; i < alfabet1.length; i++) {
            System.out.println("litera: " + alfabet1[i]);
        }
        System.out.println("Ключ шифровання: " + cluc);
        */
    }
}
