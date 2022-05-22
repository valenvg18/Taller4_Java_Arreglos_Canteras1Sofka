package taller4.excercises;

import java.util.ArrayList;
import java.util.List;

public class Punto_3 {
    private final ArrayList<Integer> primeNumber = new ArrayList<>();

    public void primeNumbers(){
        for (int i = 1; i < 1000; i++){
            if (isPrime(i)){
                this.primeNumber.add(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number == 0 || number == 1 || number == 4) {
            return false;
        }
        return !isPrimeNumber(number);
    }

    private static boolean isPrimeNumber(int number) {
        for (int x = 2; x < number / 2; x++) {
            if (number % x == 0)
                return true;
        }
        return false;
    }

    public List<Integer> getPrimeNumber() {
        return primeNumber;
    }
}
