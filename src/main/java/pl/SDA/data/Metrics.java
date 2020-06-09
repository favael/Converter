package data;

import java.util.Scanner;

public class Metrics {
    double feet;
    double metr;
    double yard;
    double landMile;
    double seaMile;


    public double feetToMetr(double feet) {
        this.feet = feet;
        return feet / 3.2808;
    }

    public double feetToYard(double feet) {
        this.feet = feet;
        return feet * 0.33333;
    }


    public double feetToLandMile(double feet) {
        this.feet = feet;
        return feet * 0.00018939;
    }

    public double feetToSeaMile(double metr) {
        this.metr = metr;
        return metr * 0.00016457883;
    }

    public double metrToFeet(double metr) {
        this.metr = metr;
        return metr * 3.2808;
    }

    public double metrToSeaMile(double metr) {
        this.metr = metr;
        return metr * 0.00053961;
    }

    public double metrToYard(double metr) {
        this.metr = metr;
        return metr * 1.0936;
    }

    public double metrToLandMile(double metr) {
        this.metr = metr;
        return metr * 0.0006213699494949;
    }

    public double yardToFeet(double yard) {
        this.yard = yard;
        return yard * 3.0000;
    }

    public double yardToMetr(double yard) {
        this.yard = yard;
        return yard / 1.0936;
    }

    public double yardToSeaMile(double yard) {
        this.yard = yard;
        return yard * 0.00049374;
    }

    public double yardToLandMile(double yard) {
        this.yard = yard;
        return yard * 0.000568181818;
    }

    public double landMileToFeet(double landMile) {
        this.landMile = landMile;
        return landMile * 5280.0;
    }

    public double landMileToMetr(double landMile) {
        this.landMile = landMile;
        return landMile * 1609.344;
    }

    public double landMileToYard(double landMile) {
        this.landMile = landMile;
        return landMile * 1760.0;
    }

    public double landMileToSeaMile(double landMile) {
        this.landMile = landMile;
        return landMile * 0.8689779798566;
    }

    public double seaMileToFeet(double seaMile) {
        this.seaMile = seaMile;
        return seaMile * 6076.11548556;
    }

    public double seaMileToMetr(double seaMile) {
        this.seaMile = seaMile;
        return seaMile * 1852.0;
    }

    public double seaMileToYard(double seaMile) {
        this.seaMile = seaMile;
        return seaMile * 2025.37;
    }

    public double seaMileToLandMile(double seaMile) {
        this.seaMile = seaMile;
        return seaMile * 1.15;
    }


    public void wyborMetrics() {
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Wybierz swój przelicznik: ");
        System.out.println ("1. Stopy na metry: ");
        System.out.println ("2. Stopy na yardy: ");
        System.out.println ("3. Stopy na mile lądowe: ");
        System.out.println ("4. Stopy na mile morskie: ");
        System.out.println ("5. Metry na stopy: ");
        System.out.println ("6. Metry na yardy: ");
        System.out.println ("7. Metry na mile lądowe: ");
        System.out.println ("8. Metry na mile morskie: ");
        System.out.println ("9. Yardy na stopy: ");
        System.out.println ("10. Yardy na metry: ");
        System.out.println ("11. Yardy na mile lądowe: ");
        System.out.println ("12. Yardy na mile morskie: ");
        System.out.println ("13. Mile lądowe na stopy");
        System.out.println ("14. Mile lądowe na metry: ");
        System.out.println ("15. Mile lądowe na yardy: ");
        System.out.println ("16. Mile lądowe na mile morskie: ");
        System.out.println ("17. Mile morskie na stopy: ");
        System.out.println ("18. Mile morskie na metry: ");
        System.out.println ("19. Mile morskie na yardy: ");
        System.out.println ("20. Mile morskie na mile lądowe: ");
        System.out.println ("21. Cofnij... ");


        boolean isFinished = false;
        while (!isFinished) {
            int operation = scanner.nextInt ();
            switch (operation) {

                case 1:
                    System.out.println ("Podaj wartość: ");
                    feetToMetr (scanner.nextDouble ());
                    break;
                case 2:
                    System.out.println ("Podaj wartość: ");
                    feetToYard (scanner.nextDouble ());
                    break;
                case 3:
                    System.out.println ("Podaj wartość: ");
                    feetToLandMile (scanner.nextDouble ());
                    break;
                case 4:
                    System.out.println ("Podaj wartość: ");
                    feetToSeaMile (scanner.nextDouble ());
                    break;
                case 5:
                    System.out.println ("Podaj wartość: ");
                    metrToFeet (scanner.nextDouble ());
                    break;
                case 6:
                    System.out.println ("Podaj wartość: ");
                    metrToYard (scanner.nextDouble ());
                case 7:
                    System.out.println ("Podaj wartość: ");
                    metrToLandMile (scanner.nextDouble ());
                    break;
                case 8:
                    System.out.println ("Podaj wartość: ");
                    metrToSeaMile (scanner.nextDouble ());
                    break;
                case 9:
                    System.out.println ("Podaj wartość: ");
                    yardToFeet (scanner.nextDouble ());
                    break;
                case 10:
                    System.out.println ("Podaj wartość: ");
                    yardToMetr (scanner.nextDouble ());
                    break;
                case 11:
                    System.out.println ("Podaj wartość: ");
                    yardToLandMile (scanner.nextDouble ());
                    break;
                case 12:
                    System.out.println ("Podaj wartość: ");
                    yardToSeaMile (scanner.nextDouble ());
                    break;
                case 13:
                    System.out.println ("Podaj wartość: ");
                     landMileToFeet (scanner.nextDouble ());
                    break;
                case 14:
                    System.out.println ("Podaj wartość: ");
                    landMileToMetr (scanner.nextDouble ());
                    break;
                case 15:
                    System.out.println ("Podaj wartość: ");
                    landMileToYard (scanner.nextDouble ());
                    break;
                case 16:
                    System.out.println ("Podaj wartość: ");
                    landMileToSeaMile (scanner.nextDouble ());
                    break;
                case 17:
                    System.out.println ("Podaj wartość: ");
                    seaMileToFeet (scanner.nextDouble ());
                    break;
                case 18:
                    System.out.println ("Podaj wartość: ");
                    seaMileToMetr (scanner.nextDouble ());
                    break;
                case 19:
                    System.out.println ("Podaj wartość: ");
                    seaMileToYard (scanner.nextDouble ());
                    break;
                case 20:
                    System.out.println ("Podaj wartość: ");
                    seaMileToLandMile (scanner.nextDouble ());
                    break;
                case 21:
                    isFinished = true;
                    System.out.println ("Koniec programu");
                    break;


            }

        }
    }
}






