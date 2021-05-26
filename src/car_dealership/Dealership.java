package car_dealership;

import java.sql.SQLOutput;

public class Dealership {

    public static void main(String[] args) {
        Customer cust1 = new Customer("Tom", "123 Anything St. ", 12000);

        Vehicle vehicle = new Vehicle("BMW", "M3", 20000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, true);

        Vehicle car = new Vehicle("BMW", "M3", 20000);

        boolean value = car.equals(vehicle);
        System.out.println(value);
    }
}
