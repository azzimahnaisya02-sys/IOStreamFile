package Bagian2.BacaTulis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tugas242 {
    public static void main(String[] args) {
        String namaFile = "hari.txt";
        String[] hariTambahan = {"Sabtu", "Minggu"};

        // 1. Menambahkan (append) data ke file
        // Argumen 'true' pada FileWriter mengaktifkan mode append
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile, true))) {
            for (String h : hariTambahan) {
                writer.write(h);
                writer.newLine();
            }
            System.out.println("Berhasil menambahkan data ke " + namaFile);
        } catch (IOException e) {
            System.out.println("Error saat menulis file: " + e.getMessage());
        }

        // 2. Membaca dan menampilkan seluruh isi file
        System.out.println("\nSeluruh isi file " + namaFile + " saat ini:");
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
    

