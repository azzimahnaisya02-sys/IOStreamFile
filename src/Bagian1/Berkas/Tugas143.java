package Bagian1.Berkas;
import java.io.File;
import java.io.IOException;

public class Tugas143 {
    public static void main(String[] args) {
        // 1. Membuat objek File
        File file = new File("sementara.txt");

        try {
            // 2. Membuat berkas
            if (file.createNewFile()) {
                System.out.println("Berkas 'sementara.txt' berhasil dibuat.");
            }

            // 3. Menampilkan status keberadaan sebelum dihapus
            System.out.println("Status sebelum dihapus: " + file.exists());

            // 4. Menghapus berkas
            if (file.delete()) {
                System.out.println("Berkas 'sementara.txt' berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus berkas.");
            }

            // 5. Menampilkan status keberadaan sesudah dihapus
            System.out.println("Status sesudah dihapus: " + file.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
    

