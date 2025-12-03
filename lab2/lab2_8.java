package lab2 ;

import java.util.Scanner ;

class TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32 ;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0 ;
    }
}

public class lab2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mode (C_TO_F or F_TO_C):") ;
        String mode = scanner.nextLine() ;
        System.out.println("Enter temperature:") ;
        double temperature = scanner.nextDouble() ;
        double result ;

        if (mode.equalsIgnoreCase("C_TO_F")) {
            result = TempConverter.celsiusToFahrenheit(temperature) ;
            System.out.printf("Result: %.2f °F%n", result) ;
        } else if (mode.equalsIgnoreCase("F_TO_C")) {
            result = TempConverter.fahrenheitToCelsius(temperature) ;
            System.out.printf("Result: %.2f °C%n", result) ;
        } else {
            System.out.println("Invalid mode!") ;
        }

        scanner.close() ;
    }
}
