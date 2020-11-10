package hue1;

import java.util.Scanner;

public class Hue1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean end = true;
        do {
            System.out.println("1...Primzahlen ausgeben");
            System.out.println("2...Primzahlen Summe");
            System.out.println("3...Exit");

            int speicher = Integer.parseInt(scan.nextLine());

            switch (speicher) {
                case 1:
                    System.out.println("");
                    System.out.println("Geben sie den Maximumwert ein:");
                    int index = Integer.parseInt(scan.nextLine());
                    EratosthenesPrimeSieve prim = new EratosthenesPrimeSieve(index);
                    prim.printPrimes();
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("");
                    System.out.println("Geben sie den Maximumwert ein:");
                    int index2 = Integer.parseInt(scan.nextLine());
                    EratosthenesPrimeSieve prim2 = new EratosthenesPrimeSieve(index2);
                    prim2.algorithm();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        } while (end);

    }

}
