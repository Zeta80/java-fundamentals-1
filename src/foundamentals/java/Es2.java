package foundamentals.java;

import java.util.Scanner;

public class Es2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero tra 1 e 1000: ");
        int num = input.nextInt();
        while (num <= 0 || num >= 1000) {
            System.out.print("Inserisci un numero valido tra 1 e 1000: ");
            num = input.nextInt();
        }
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
