package Bagian1.Berkas;
import java.io.File;

public class Tugas142 {
    public static void main(String[] args) {
        // 1. Membuat objek File yang merepresentasikan folder "arsip"
        File folder = new File("arsip");

        // 2. Menggunakan method mkdir() untuk membuat folder
        boolean berhasil = folder.mkdir();

        // 3. Menampilkan pesan berhasil atau gagal
        if (berhasil) {
            System.out.println("Folder 'arsip' berhasil dibuat.");
        } else {
            System.out.println("Gagal membuat folder (mungkin sudah ada).");
        }
    }
}
   
