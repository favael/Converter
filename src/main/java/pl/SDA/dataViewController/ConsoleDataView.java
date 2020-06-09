package dataViewController;

import data.Mass;
import data.Metrics;
import data.Temperature;


import java.util.InputMismatchException;
import java.util.Scanner;


public class ConsoleDataView implements Runnable {


    static Scanner scanner = new Scanner (System.in);

    private static void printOptions() {
        System.out.println ("Wybierz opcję: ");
        for (Opcje option : Opcje.values ()) {
            System.out.println (option.optionNumber
                    + ": " + option
                    + " - " + option.desciprion);
        }
    }


    private enum Opcje {

        MASS (1, "Przeliczenie wagi."),
        METRICS (2, "Przeliczenie pomiarów."),
        TEMPERATURE (3, "Przeliczenie temperatury."),
        EXIT (4, "Wyjście.");

        public int optionNumber;
        public String desciprion;


        Opcje(int optionNumber, String desciprion) {
            this.optionNumber = optionNumber;
            this.desciprion = desciprion;

        }
    }


    public  void wyborOpcji() {


        Mass mass = new Mass ();
        Metrics metrics = new Metrics ();
        Temperature temp = new Temperature();

        try {
            boolean isFinished = false;
            while (!isFinished) {
                printOptions ();
                int operation = scanner.nextInt ();

                switch (operation) {
                    case 1:
                        mass.wyborMasy ();
                        break;
                    case 2:
                        metrics.wyborMetrics ();
                        break;
                    case 3:
                        temp.wyborTemp();
                        break;
                    case 4:
                        isFinished = true;
                        break;

                }
            }
        } catch (InputMismatchException e) {
            System.err.println ("Podałeś złą wartość! Spróbuj ponownie.");
        }
    }

    @Override
    public void run() {
        wyborOpcji ();
    }
}



