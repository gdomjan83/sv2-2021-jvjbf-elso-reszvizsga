package cars;

public class Car {
    private String brand;
    private double engineCapactiy;
    private Color color;
    private int price;

    public Car(String brand, double engineCapactiy, Color color, int price) {
        this.brand = brand;
        this.engineCapactiy = engineCapactiy;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getEngineCapactiy() {
        return engineCapactiy;
    }

    public Color getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void decreasePrice(int percent) {
        price = (int) (price * ((100 - percent) / 100.0));
    }
}
