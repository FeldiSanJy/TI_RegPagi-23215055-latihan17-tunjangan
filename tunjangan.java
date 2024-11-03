/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class tunjangan {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok (Rp): ");
        double gajiPokok = scanner.nextDouble();

        System.out.print("Apakah Anda sudah menikah? (ya/tidak): ");
        String statusMenikah = scanner.next();

        double tunjangan = 0;

        if (statusMenikah.equalsIgnoreCase("ya")) {
            tunjangan = 0.35 * gajiPokok;
        }

        double totalGaji = gajiPokok + tunjangan;

        System.out.println("Total Gaji: Rp " + totalGaji);
        System.out.println("Tunjangan: Rp " + tunjangan);
    }
}    

