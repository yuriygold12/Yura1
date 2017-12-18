package HomeWork5;

import java.time.LocalDate;

public class Transportation {
    private Goods [] goods;
    private int countgoods;
    private String citydeparture;
    private LocalDate datetransportation;
    private String cityofarrival;

    public Transportation(Goods[] goods, int countgoods, String citydeparture,
                          LocalDate datetransportation, String cityofarrival) {
        this.goods = goods;
        this.countgoods = countgoods;
        this.citydeparture = citydeparture;
        this.datetransportation = datetransportation;
        this.cityofarrival = cityofarrival;
    }
}
