package foundamentals.java;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Es1 {
    //eSERCIZIO BIGLIETTO DEL TRENO
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        int km = scanner.nextInt();
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        System.out.print(km + " " + eta);


        double pricePerKm = 0.21;
        double totalPrice = km * pricePerKm;

        if (eta < 18) {
            totalPrice *= 0.8;  // applica lo sconto del 20%
        } else if (eta >= 65) {
            totalPrice *= 0.6;  // applica lo sconto del 40%
        }

        System.out.println("Il prezzo totale del viaggio è di " + df.format(totalPrice) + " $");
    }
}

