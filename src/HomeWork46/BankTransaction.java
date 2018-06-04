package HomeWork46;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class BankTransaction {
    private String Name;
    private String SurName;
    private ArrayList<LocalDate> dates = new ArrayList<>();
    private String address;
    private String numberCart;
    private double balance;
    private ArrayList<Double> transaction = new ArrayList<>();


    public BankTransaction(String name, String surName) {
        this.Name = name;
        this.SurName = surName;
    }

    public BankTransaction(String address, String numberCart, double balance) {
        this.address = address;
        this.numberCart = numberCart;
        this.balance = balance;
    }

    public BankTransaction() {
        this.dates = new ArrayList<>();
        this.address = "Trulovskoho";
        this.numberCart = "1234567";
        this.balance = 7000;
        this.transaction = new ArrayList<>();
    }

    public void setTransaction() {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Double value = random.nextDouble() + (110) + 30;
            if (this.balance > 0) {
                dates.add(i, LocalDate.of(2018, 5, 12));
                this.balance -= value;
                transaction.add(i, value);
            } else {
                System.out.println("Balanse < 0");
                break;
            }
        }
    }

    public void showTranzaction() {
        System.out.println("Date: " + this.dates);
        System.out.println("Transaction: " + transaction);
        System.out.println("CartNumber: " + this.numberCart);
        System.out.println("Address: " + this.address);
        System.out.println("Balance: " + this.balance);
    }

    public void showKey() {
        System.out.println("Name: " + Name);
        System.out.println("SurName: " + SurName);
    }

    public String getName() {
        return Name;
    }

    public String getSurName() {
        return SurName;
    }

    public ArrayList<LocalDate> getDates() {
        return dates;
    }

    public String getAddress() {
        return address;
    }

    public String getNumberCart() {
        return numberCart;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSurName(String surName) {
        SurName = surName;
    }

    public void setDates(ArrayList<LocalDate> dates) {
        this.dates = dates;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberCart(String numberCart) {
        this.numberCart = numberCart;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setTransaction(ArrayList<Double> transaction) {
        this.transaction = transaction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankTransaction that = (BankTransaction) o;
        return Double.compare(that.balance, balance) == 0 &&
                Objects.equals(Name, that.Name) &&
                Objects.equals(SurName, that.SurName) &&
                Objects.equals(dates, that.dates) &&
                Objects.equals(address, that.address) &&
                Objects.equals(numberCart, that.numberCart) &&
                Objects.equals(transaction, that.transaction);
    }

    @Override
    public int hashCode() {

        return Objects.hash(Name, SurName, dates, address, numberCart, balance, transaction);
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "Name='" + Name + '\'' +
                ", SurName='" + SurName + '\'' +
                ", dates=" + dates +
                ", address='" + address + '\'' +
                ", numberCart='" + numberCart + '\'' +
                ", balance=" + balance +
                ", transaction=" + transaction +
                '}';
    }
}
