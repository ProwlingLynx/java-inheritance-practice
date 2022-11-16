package cars;

public class FordFusion extends Car {
    private String brand;
    public FordFusion(int weight, int speed, String color, int seats, int maxFuel, int gasTank) {
        super(weight, speed, 4, color, seats, maxFuel, gasTank);
        this.brand = "Ford";
    }
    public void crashAndBurn() {
        System.out.println("Oh no! Your car has exploded!");
    }
}
