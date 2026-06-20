package Bagian2.BacaTulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tugas241 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // 1. Menulis data ke file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (String h : hari) {
                writer.write(h);
                writer.newLine(); // Membuat baris baru
            }
            System.out.println("Berhasil menulis ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Error saat menulis file: " + e.getMessage());
        }

        // 2. Membaca data dari file dan menampilkannya
        System.out.println("\nIsi file " + namaFile + ":");
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Error saat membaca file: " + e.getMessage());
        }
    }
}
    

