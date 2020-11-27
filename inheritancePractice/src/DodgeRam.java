public class DodgeRam extends Car {
    private int fourWheelDrive;
    private int bed;

    public DodgeRam( int wheels, int doors, int steering, int speed, int fourWheelDrive, int bed){
        super(1,1, wheels, doors, steering, speed);
        this.fourWheelDrive = fourWheelDrive;
        this.bed = bed;
    }

    @Override
    public void moveSpeed(int mph) {
        System.out.println("The truck is moving");
        super.moveSpeed(mph);
    }
}
