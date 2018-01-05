package HomeWork9;

public class Office {
    private String addresOffice;
    private Operator[]operators;
    int countOperator;


    public Office(String addresOffice)
    {
        this.addresOffice = "Trulovskoho";
        this.operators = null;
        this.countOperator = 0;
    }

    public Office(String addresOffice, Operator[] operators, int countOperator) {
        this.addresOffice = addresOffice;
        this.operators = operators;
        this.countOperator = countOperator;
    }

    public String getAddresOffice() {
        return addresOffice;
    }

    public void setAddresOffice(String addresOffice) {
        this.addresOffice = addresOffice;
    }

    public Operator[] getOperators() {
        return operators;
    }

    public void setOperators(Operator[] operators) {
        this.operators = operators;
    }

    public int getCountOperator() {
        return countOperator;
    }

    public void setCountOperator(int countOperator) {
        this.countOperator = countOperator;
    }
}
