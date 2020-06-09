package data;

import java.util.Scanner;

public class Temperature {
    double celsius;
    double kelwin;
    double fahrenheit;


    public double celsiusToKelwin(double celsius) {
        this.celsius = celsius;
        return celsius + 273.15;

    }

    public double celsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
        return (celsius * 1.8) + 32;

    }

    public double kelwinToCelsius(double kelwin) {
        this.kelwin = kelwin;
        return kelwin - 273.15;
    }

    public double kelwinToFahrenheit(double kelwin) {
        this.kelwin = kelwin;
        return (kelwin - 273.15) * 1.8 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        return (fahrenheit - 32) / 1.8;
    }

    public double  fahrenheitToKelwin(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        return (fahrenheit - 32) / 1.8 + 273.15;

    }
    public void wyborTemp() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz swój przelicznik: ");
        System.out.println("1. Celsiusz na Kelwiny: ");
        System.out.println("2. Celsiusz n Fahrenheity: ");
        System.out.println("3. Kelwin na Celsiusz: ");
        System.out.println("4. Kelwin na Fahrenheit: ");
        System.out.println("5. Fahrenheity na Celsiusze: ");
        System.out.println("6. Fahrenheity na Kelwin: ");
        System.out.println("7. Wyjście: ");

        boolean isFinished = false;
        while (!isFinished) {
            int operation = scanner.nextInt ();
            switch (operation) {

                case 1:
                    System.out.println("Podaj wartość (Celsiusz na Kelwiny): ");
                    celsiusToKelwin(scanner.nextDouble());
                    break;
                case 2:
                    System.out.println("Podaj wartość (Celsiusz n Fahrenheity): ");
                    celsiusToFahrenheit(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Podaj wartość (Kelwin na Celsiusz): ");
                    kelwinToCelsius(scanner.nextDouble());
                    break;
                case 4:
                    System.out.println("Podaj wartość (Kelwin na Fahrenheit): ");
                    kelwinToFahrenheit(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Podaj wartość (Fahrenheity na Celsiusze): ");
                    fahrenheitToCelsius(scanner.nextDouble());
                    break;
                case 6:
                    System.out.println("Podaj wartość (Fahrenheity na Kelwin): ");
                    fahrenheitToKelwin(scanner.nextDouble());
                case 7:
                    isFinished = true;
                    System.out.println("Koniec programu");
                    break;
            }
        }
    }
}


