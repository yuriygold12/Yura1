package HomeWork9;

public enum Color {
    yellow("wovtuy"),green("Selenuy"),red("Cervonuy");
    String name;

     Color(String name) {
        this.name = name;
    }

    public String getNameColor()
    {
        return name;
    }
}
