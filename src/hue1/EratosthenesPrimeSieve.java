package hue1;

import java.util.ArrayList;

public class EratosthenesPrimeSieve implements PrimeSieve {

    int limit;
    ArrayList<Integer> listPrim;
    ArrayList<Integer> listEven;

    public EratosthenesPrimeSieve(int pLimit) {
        this.limit = pLimit;
        listPrim = new ArrayList<Integer>();
        listEven = new ArrayList<Integer>();
    }

    @Override //Schaut nach ob "p" primzahl ist
    public boolean isPrime(int p) {
        if (p <= 2) {
            return (p == 2);
        }
        for (long i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void printPrimes() {
        System.out.println("Prime numbers:");
        int counter = 1;
        for (int i = 2; i < this.limit; i++) {
            if (isPrime(i)) {
                System.out.println(counter + ".  -  " + i);
                counter++;
            }

        }
    }

    public void algorithm() {
        //arraylist befüllen bis zum limit
        for (int i = 0; i < this.limit; i++) {
            if (i >= 2) {
                listPrim.add(i);
            }
        }

        //Zahlen "aussortieren"
        for (int i = 1; i < listPrim.size(); i++) {
            if (listPrim.get(i) % 2 == 0) {
                listPrim.remove(i);
            }
        }

        for (int i = 2; i < listPrim.size(); i++) {
            if (listPrim.get(i) % 3 == 0) {
                listPrim.remove(i);
            }
        }

        for (int i = 3; i < listPrim.size(); i++) {
            if (listPrim.get(i) % 5 == 0) {
                listPrim.remove(i);
            }
        }

        for (int i = 0; i < this.limit; i++) {
            if (i % 2 == 0) {
                listEven.add(i);
            }
        }

        //Richtig ausgeben
        for (int i = 0; i < listEven.size(); i++) {
            for (int u = 0; u < listPrim.size(); u++) {
                for (int j = 0; j < listPrim.size(); j++) {
                    if (listPrim.get(u) + listPrim.get(j) == listEven.get(i)) {
                        System.out.println(listEven.get(i) + " Summe: " + listPrim.get(u) + " + " + listPrim.get(j));
                    }
                }
            }
        }
    }
}
