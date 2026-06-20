package Bagian3.Kontak;

public class Main {
    public static void main(String[] args) {
        BukuKontak bk = new BukuKontak();
        
        // Menambah beberapa data untuk uji coba
        bk.tambahKontak("Budi", "0812345678");
        bk.tambahKontak("Siti", "0898765432");

        // Menguji method cariKontak
        System.out.println("--- Mencari Budi ---");
        bk.cariKontak("Budi");

        System.out.println("\n--- Mencari Ahmad (Data tidak ada) ---");
        bk.cariKontak("Ahmad");
    }
}
    

