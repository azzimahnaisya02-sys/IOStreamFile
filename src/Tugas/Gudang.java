package Tugas;

import java.io.*;
import java.util.ArrayList;

public class Gudang {
    private ArrayList<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang b) {
        daftarBarang.add(b);
    }

    public void tampilkanSemua() {
        for (Barang b : daftarBarang) {
            b.info();
        }
    }

    public void simpanKeBerkas(String namaFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            for (Barang b : daftarBarang) {
                writer.write(b.keBaris());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    public void muatDariBerkas(String namaFile) {
        daftarBarang.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                String[] data = baris.split(",");
                daftarBarang.add(new Barang(data[0], Double.parseDouble(data[1]), Integer.parseInt(data[2])));
            }
        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }

    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += (b.getHarga() * b.getStok());
        }
        return total;
    }
}
    

