//Nama : Siti Naisya Azzimah
//NPM  : 2410010002
package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        // 1. Array Kategori
        String[] kategori = {"Elektronik", "Alat Tulis", "Sembako"};
        System.out.println("Kategori Tersedia:");
        for (String k : kategori) System.out.println("- " + k);

        // 2. Operasi Gudang
        Gudang gudang = new Gudang();
        gudang.tambahBarang(new Barang("Laptop", 5000000, 2));
        gudang.tambahBarang(new Barang("Buku"  , 10000  , 50));
        gudang.tambahBarang(new Barang("Beras" , 15000  , 20));
        gudang.tambahBarang(new Barang("Mouse" , 150000 , 5));
        gudang.tambahBarang(new Barang("Pena"  , 5000   , 100));

        gudang.simpanKeBerkas("barang.txt");
        System.out.println("\nData telah disimpan ke barang.txt");

        // 3. Objek Gudang Baru untuk pengujian
        Gudang gudangBaru = new Gudang();
        gudangBaru.muatDariBerkas("barang.txt");
        
        System.out.println("\nData setelah dimuat kembali:");
        gudangBaru.tampilkanSemua();
        System.out.println("Total Nilai Persediaan: Rp" + gudangBaru.totalNilai());
    }
}
    

