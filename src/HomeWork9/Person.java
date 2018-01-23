package HomeWork9;

import java.util.Objects;

public class Person {

    private String name;
    private String surname;


    public Person() {
        this.name = "yura";
        this.surname = "bahlay";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void showinfo() {
        System.out.println("Name = " + name + " Suranme = " + surname);
    }

    @Override
    public String toString() {
        return "name='" + name + ", surname='" + surname;
    }


   // @Override
   // public boolean equals(Object o) {
     //   if (this == o) return true;
     ///   if (o == null || getClass() != o.getClass()) return false;
      //  Person person = (Person) o;
      //  return Objects.equals(name, person.name) &&
       //         Objects.equals(surname, person.surname);
   // }


    public boolean equals(Object ob) {
       // if(this == ob) {return true;}
        Person per = (Person) ob;
        if(!super.equals(ob)){return false;}
        if (this.name == per.name && this.surname == per.surname) { return true; }
        if (this.name != per.name && this.surname != per.surname) { return false; }
        else { return false; }
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
