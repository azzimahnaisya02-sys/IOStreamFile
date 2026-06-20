package Bagian3.Kontak;

 import java.util.ArrayList;

public class BukuKontak {
    private ArrayList<Kontak> daftarKontak = new ArrayList<>();

    public void tambahKontak(String nama, String nomor) {
        daftarKontak.add(new Kontak(nama, nomor));
    }

    // Method cariKontak sesuai instruksi
    public void cariKontak(String nama) {
        boolean ditemukan = false;
        for (Kontak k : daftarKontak) {
            if (k.nama.equalsIgnoreCase(nama)) {
                System.out.println("Kontak ditemukan: " + k.nama + " - " + k.nomor);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kontak '" + nama + "' tidak ditemukan.");
        }
    }
}
    
