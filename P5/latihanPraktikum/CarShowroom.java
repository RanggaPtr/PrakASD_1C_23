package P5.latihanPraktikum;

public class CarShowroom {
    public static class Car {
        String make;
        String model;
        int year;
        int topAcceleration;
        int topPower;

        public Car(String make, String model, int year, int topAcceleration, int topPower) {
            this.make = make;
            this.model = model;
            this.year = year;
            this.topAcceleration = topAcceleration;
            this.topPower = topPower;
        }
    }

    public Car[] getCars() {
        return new Car[] {
                new Car("BMW", "M2 Coupe", 2016, 6816, 728),
                new Car("Ford", "Fiesta ST", 2014, 3921, 575),
                new Car("Nissan", "370Z", 2009, 4360, 657),
                new Car("Subaru", "BRZ", 2014, 4058, 609),
                new Car("Subaru", "Impreza WRX STI", 2013, 6255, 703),
                new Car("Toyota", "AE86 Trueno", 1986, 3700, 553),
                new Car("Toyota", "86/GT86", 2014, 4180, 609),
                new Car("Volkswagen", "Golf GTI", 2014, 4180, 631),
        };
    }

    public int divideAndConquerMaxAcceleration(Car[] cars, int low, int high) {
        if (low == high) {
            return cars[low].topAcceleration;
        }

        int mid = (low + high) / 2;
        int left = divideAndConquerMaxAcceleration(cars, low, mid);
        int right = divideAndConquerMaxAcceleration(cars, mid + 1, high);

        return Math.max(left, right);
    }

    public int divideAndConquerMinAcceleration(Car[] cars, int low, int high) {
        if (low == high) {
            return cars[low].topAcceleration;
        }

        int mid = (low + high) / 2;
        int left = divideAndConquerMinAcceleration(cars, low, mid);
        int right = divideAndConquerMinAcceleration(cars, mid + 1, high);

        return Math.min(left, right);
    }

    public double bruteForceAvgPower(Car[] cars) {
        int sum = 0;
        for (Car car : cars) {
            sum += car.topPower;
        }
        return (double) sum / cars.length;
    }
}
