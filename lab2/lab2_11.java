package lab2;

import java.util.Scanner;

class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

public class lab2_11 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Car Model: ");
            String carModel = input.nextLine().trim();

            System.out.print("Enter Year: ");
            int oldYear = Integer.parseInt(input.nextLine().trim());

            System.out.print("Enter New Year: ");
            int newYear = Integer.parseInt(input.nextLine().trim());

            Car car = new Car(carModel, oldYear);
            car.setYear(newYear);

            System.out.println("Model: " + car.getModel());
            System.out.println("Year: " + car.getYear());
        }
    }
}
