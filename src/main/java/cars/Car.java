package cars;

public class Car {
    private String model;
    private double engineCapactiy;
    private Color color;
    private int price;

    public Car(String model, double engineCapactiy, Color color, int price) {
        this.model = model;
        this.engineCapactiy = engineCapactiy;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
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
