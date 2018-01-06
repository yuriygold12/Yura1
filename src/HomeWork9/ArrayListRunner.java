package HomeWork9;

import java.util.ArrayList;

public class ArrayListRunner {
    public static void main(String[] args) {

        Person persons[] = new Person[3];

        ArrayList<Person> pr = new ArrayList<>();

        persons[0] = new Client("Olesja","olesivna",12,"Antonucja") ;

        Client cli =  new Client("Olesja","olesivna",12,"Antonucja") ;

        pr.add(new Client("Olesja","olesivna",12,"Antonucja"));

        System.out.println();

        int size = pr.size();

        System.out.println();

        System.out.println("Кількість елементів: "+size);

        System.out.println(persons[0]);

        System.out.println(pr.get(0));
    }
}
