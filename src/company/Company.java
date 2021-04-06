package company;

import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setData("Bmw", "Black", 500, 2000000);
        car2.setData("Cooper", "Green", 300, 650000);
        car3.setData("Bmw", "Black", 500, 2000000);
        
        
car1.EQUALS(car1, car2);
car1.EQUALS(car1, car3);
    }

}
