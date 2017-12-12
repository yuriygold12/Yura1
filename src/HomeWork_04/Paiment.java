package HomeWork_04;

import java.time.LocalDate;

public class Paiment {
    int numbercatr;
    LocalDate paumentdate;
    String paumentcurrency;
    String country;

    public Paiment(int numbercatr, LocalDate paumentdate, String paumentcurrency, String country) {
        this.numbercatr = numbercatr;
        this.paumentdate = paumentdate;
        this.paumentcurrency = paumentcurrency;
        this.country = country;
    }
}
