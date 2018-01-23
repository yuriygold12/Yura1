package Lesson9;

import HomeWork8.Client;
import HomeWork8.Person;

import java.util.ArrayList;

public class lesson_9_1 {
    public static void main(String[] args) {
        Person persons[] = new Person[3];
        ArrayList<Person> personArrayList = new ArrayList<Person>();
        persons[0] =  new Client("Nazar", "Mh",68,"IF");
        personArrayList.add(new Client("Nazar", "Mh",68,"IF"));
        System.out.println(persons[0]);
        System.out.println(personArrayList.get(0));
       // personArrayList.
    }
}
