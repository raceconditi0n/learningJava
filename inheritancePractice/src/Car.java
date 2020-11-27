public class Car extends Vehicle{
    private int wheels;
    private int doors;
    private int steering;
    private int speed;

    public Car(int moves, int passengers, int wheels, int doors, int steering, int speed){
        super(moves, passengers);
        this.wheels = wheels;
        this.doors = doors;
        this.steering = steering;
        this.speed = speed;
    }

    public void moveSpeed(int mph){
        System.out.println("Traveling at " + mph + "mph");
    }
}
