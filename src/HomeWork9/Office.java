package HomeWork9;

import java.util.ArrayList;

public class Office {
    private String addresOffice;
    private ArrayList <Operator> operators;
    private int countOperator;


    public Office()
    {
        this.addresOffice = "Trulovskoho";
        this.operators = new ArrayList <>();
        this.countOperator = 0;
    }

    public Office(String addresOffice, ArrayList <Operator>  operators, int countOperator) {
        this.addresOffice = addresOffice;
        this.operators = new ArrayList<>(operators);
        this.countOperator = countOperator;
    }

    public String getAddresOffice() {
        return addresOffice;
    }

    public void setAddresOffice(String addresOffice) {
        this.addresOffice = addresOffice;
    }

    public ArrayList <Operator> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList <Operator>  operators) {
        this.operators = operators;
    }

    public int getCountOperator() {
        return countOperator;
    }

    public void setCountOperator(int countOperator) {
        this.countOperator = countOperator;
    }

    public void showinfo()
    {
        System.out.println("Адрес Офіса: "+addresOffice);
        System.out.println("Operator : "+operators);
        System.out.println("Кількість операторів у офісі: "+countOperator);
    }
}
