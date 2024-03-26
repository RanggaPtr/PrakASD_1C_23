package P5.latihanPraktikum;

import P5.latihanPraktikum.CarShowroom.Car;

public class CarShowroomMain {
    public static void main(String[] args) {
        CarShowroom showroom = new CarShowroom();
        Car[] cars = showroom.getCars();

        int maxAcceleration = showroom.divideAndConquerMaxAcceleration(cars, 0, cars.length - 1);
        int minAcceleration = showroom.divideAndConquerMinAcceleration(cars, 0, cars.length - 1);
        double avgPower = showroom.bruteForceAvgPower(cars);

        System.out.println("Top Acceleration Tertinggi: " + maxAcceleration);
        System.out.println("Top Acceleration Terendah: " + minAcceleration);
        System.out.printf("Rata-rata Top Power: %.2f\n", avgPower);
    }

}
