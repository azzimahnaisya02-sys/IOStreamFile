package Bagian2.BacaTulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tugas243 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        int jumlahBaris = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            // Membaca file baris demi baris
            while (reader.readLine() != null) {
                jumlahBaris++;
            }
            System.out.println("Jumlah baris di dalam file '" + namaFile + "' adalah: " + jumlahBaris);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file: " + e.getMessage());
        }
    }
}
    
