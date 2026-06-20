package Bagian1.Berkas;

import java.io.File;

public class Tugas141 {
    public static void main(String[] args) {
        // 1. Membuat objek File yang menunjuk ke "laporan.txt"
        File berkas = new File("laporan.txt");

        // 2. Menampilkan apakah berkas tersebut ada
        if (berkas.exists()) {
            System.out.println("Berkas ditemukan.");
            
            // 3. Jika ada, tampilkan ukurannya dalam byte
            System.out.println("Ukuran berkas: " + berkas.length() + " bytes.");
        } else {
            System.out.println("Berkas 'laporan.txt' tidak ditemukan.");
        }
    }
}
    

