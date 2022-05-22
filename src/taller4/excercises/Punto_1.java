package taller4.excercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Punto_1 {

    private final ArrayList<Integer> myArray = new ArrayList<>(5);

    public List<Integer> myArrayInput() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el valor número " + (i + 1));
            int value = sc.nextInt();
            this.myArray.add(value);
        }
        return this.myArray;
    }

    public void myArrayIndex() {
        for (int i = 0; i < this.myArray.size(); i++) {
            System.out.println("Indíce de " + (i) + " = " + myArray.get(i));
        }
    }
}