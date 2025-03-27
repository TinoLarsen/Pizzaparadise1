package Domain;

public class Ordre {
    private int date;
    private String nameOfPizza;
    private int sumPrice;

    public Ordre(int date, String nameOfPizza, int Sum) {
        this.date = date;
        this.nameOfPizza = nameOfPizza;
        this.sumPrice = sumPrice;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public String getNameOfPizza() {
        return nameOfPizza;
    }
    public void setNameOfPizza(String nameOfPizza) {
        this.nameOfPizza = nameOfPizza;
    }
    public int getSum() {
        return sumPrice;
    }
    public void setSum(int Sum) {
        this.sumPrice = Sum;
    }
}

