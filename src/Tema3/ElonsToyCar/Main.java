package Tema3.ElonsToyCar;

import Tema3.ElonsToyCar.ElonsToyCar;

public class Main {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
