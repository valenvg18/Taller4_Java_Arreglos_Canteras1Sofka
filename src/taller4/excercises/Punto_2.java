package taller4.excercises;


import java.util.ArrayList;

public class Punto_2 {

    private final int[] myArray = new int[20];
    private final ArrayList<Integer> evenNumbers = new ArrayList<>();
    private final ArrayList<Integer> oddNumbers = new ArrayList<>();

    public int[] fillArrayWithRandomNumber() {
        for (int i = 0; i < this.myArray.length; i++) {
            this.myArray[i] = (int) (Math.random() * 100);
        }
        return this.myArray;
    }

    public int[] evenOrOddNumbers() {
        for (int i = 0; i < this.myArray.length; i++) {
            if (this.myArray[i] % 2 == 0) {
                this.evenNumbers.add(this.myArray[i]);
            } else {
                this.oddNumbers.add(this.myArray[i]);
            }
        }
        return this.myArray;
    }

    public ArrayList<Integer> getEvenNumbers() {
        return evenNumbers;
    }

    public ArrayList<Integer> getOddNumbers() {
        return oddNumbers;
    }
}