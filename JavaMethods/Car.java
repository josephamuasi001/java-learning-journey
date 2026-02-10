public class Car {
    public static void main(String[] args) {
        Car c1 = new Car("HVP2", 89);
    }

    String brand;
    int year;
    public void displayCarInfo(String name, int year) {
        System.out.println("Brand : " + brand);
        System.out.println("Year : " + year);
    }
}
