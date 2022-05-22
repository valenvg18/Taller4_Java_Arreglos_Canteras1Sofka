package taller4.main;

import taller4.excercises.Punto_1;
import taller4.excercises.Punto_2;
import taller4.excercises.Punto_3;
import taller4.excercises.Punto_4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = true;

        do {
            System.out.println();
            System.out.println("Bienvenido al menú del taller #4, por favor seleccione un punto a continuación: \n" +
                    "                1. Punto #1\n" +
                    "                2. Punto #2\n" +
                    "                3. Punto #3\n" +
                    "                4. Punto #4\n" +
                    "                5. Punto #5\n" +
                    "                6. Salir");
            int option = sc.nextInt();

            switch (option) {
                case 1: {

                    Punto_1 punto_1 = new Punto_1();
                    punto_1.myArrayInput();
                    punto_1.myArrayIndex();
                }
                break;
                case 2: {
                    Punto_2 punto_2 = new Punto_2();
                    System.out.println("Números aleatorios: " + Arrays.toString(punto_2.fillArrayWithRandomNumber()));
                    punto_2.evenOrOddNumbers();
                    System.out.println();
                    System.out.println("Números pares: " + punto_2.getEvenNumbers());
                    System.out.println("Números impares: " + punto_2.getOddNumbers());
                }
                break;
                case 3: {
                    Punto_3 punto_3 = new Punto_3();
                    punto_3.primeNumbers();
                    System.out.println(punto_3.getPrimeNumber());
                }
                break;
                case 4: {
                    Punto_4 punto_4 = new Punto_4();
                    punto_4.a();
                }
                break;
                case 5: {
                }
                break;
                case 6: {
                    System.out.println("Hasta pronto");
                    exit = false;
                }
                break;
                default:
                    System.out.println("Número equivocado, intentelo nuevamente");
            }
        } while (exit);
    }
}
