// EXCERCISE 1:
//Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
// dos. El programa deberá después mostrar el resultado de la suma
//Where the class start

package Introduction;

import java.util.Scanner;

public class EJ1 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Please, insert the first number: >");
        num1 = read.nextInt();
        System.out.println("Please, insert the second number: >");
        num2 = read.nextInt();
        System.out.println(num1 + " + " + num2 + ": " + (num1 + num2));

    }
}