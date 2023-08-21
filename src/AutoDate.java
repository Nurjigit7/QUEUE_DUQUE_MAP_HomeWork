public class AutoDate {
    private int year_of_issue;
    private String model;
    private int price;
    private String color;

    public AutoDate() {
    }

    public AutoDate(int year_of_issue, String model, int price, String color) {
        this.year_of_issue = year_of_issue;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "AutoDate{" +
                "year_of_issue=" + year_of_issue +
                ", model=" + model +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
