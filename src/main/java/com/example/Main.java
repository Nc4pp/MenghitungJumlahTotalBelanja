package com.example;
import java.util.Scanner;
public class Main {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grandTotal = 0;

        System.out.print("Masukkan jumlah item belanja: ");
        int jumlahItem = input.nextInt();

        for (int i = 1; i <= jumlahItem; i++) {
            System.out.print("Masukkan harga item ke-" + i + ": ");
            double harga = input.nextDouble();
            grandTotal += harga;
        }

        double diskon = 50.0;
        double hargaDiskon = grandTotal * (diskon / 100);
        double hargaSetelahDiskon = grandTotal - hargaDiskon;

        System.out.println("\nSummary");
        System.out.println("Harga before discount: " + grandTotal);
        System.out.println("Diskon: 50%");
        System.out.println("Harga diskon: " + hargaDiskon);
        System.out.println("Harga after discount: " + hargaSetelahDiskon);

        // ✅ Tutup scanner untuk menghindari warning resource leak
        input.close();
    }
}
