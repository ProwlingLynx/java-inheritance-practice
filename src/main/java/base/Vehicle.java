package base;

public class Vehicle {
    private int weight;
    private int speed;

    public Vehicle(int weight, int speed) {
        this.weight = weight;
        this.speed = speed;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }



    public void move() {
        System.out.println("Moving at the speed of " + speed + " oceans an hour");
    }
    public void honk() {
        System.out.println("Hoooonnnkkk!!!");
    }
}
