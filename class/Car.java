import java.util.Calendar;
import java.util.Date;

public class Car {
    String company;
    String model;
    short year;

    Car(String company, String model, short year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    // member function

    void displayCarInfo() {
        System.out.println("Car Info");
        System.out.println(this.company);
        System.out.println(this.model);
        System.out.println(this.year);
    }

    String checkValidity() {
        int diff = 2024 - this.year;
        return diff <= 15 ? "Not Expired" : "Expired";
    }

    void createIncurence() {

    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford ", "mastang", (short) 2013);
        car1.displayCarInfo();
        Car car2 = new Car("Toyota ", "Camry", (short) 2007);
        System.out.println(car2.checkValidity());
        Car car3 = new Car("Hyundai", "venue", (short) 2018);
        Car car4 = new Car("Hyundai ", "Creata", (short) 2017);
        car4.displayCarInfo();
        Car car5 = new Car("Hyundai", "Verna", (short) 2029);
        Car car6 = new Car("Suzkhi", "Alto", (short) 2022);
    }
}
