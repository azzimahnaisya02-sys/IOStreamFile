package Tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getters
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public int getStok() { return stok; }

    // Mengonversi data ke format string untuk disimpan di file
    public String keBaris() {
        return nama + "," + harga + "," + stok;
    }

    public void info() {
        System.out.println("Nama: " + nama + " | Harga: " + harga + " | Stok: " + stok);
    }
}
    

 
