public class Drive {
    private int power;
    private double position;
    private int id;

    public Drive(int id) {
        power = 0;
        position = 12;
        this.id = id;
    }

    public static void main(String[] args) {
        Drive leftMotor = new Drive(1);
    }

    public void drive(int power) {
        System.out.println("Motor power set to " + power);
    }

    public double getPosition() {
        return position;
    }

    public int getPower() {
        return power;
    }

    public int getId() {
        return id;
    }
}
