public class Car {
    String company;
    String model;
    short year;

    Car(String company, String model, short year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    void displayCarInfo() {
        System.out.println("Car Info");
        System.out.println(this.company);
        System.out.println(this.model);
        System.out.println(this.year);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Ford ", "mastang", (short) 2013);
        car1.displayCarInfo();
        Car car2 = new Car("Toyota ", "Camry", (short) 2016);
        Car car3 = new Car("Hyundai", "venue", (short) 2018);
        Car car4 = new Car("Hyundai ", "Creata", (short) 2017);
        car4.displayCarInfo();
        Car car5 = new Car("Hyundai", "Verna", (short) 2029);
        Car car6 = new Car("Suzkhi", "Alto", (short) 2022);
    }
}
