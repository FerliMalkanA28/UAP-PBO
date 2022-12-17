package uap_kasir;

import java.util.ArrayList;

public class Barang extends Produk {
    private String barcode;
    private String expierd;
    private ArrayList<Kategori> kategori;

    public Barang(String nama_produk, double harga, int jumlah, double diskon, String barcode, String expierd, ArrayList<Kategori> kategori) {
        super(nama_produk, harga, jumlah, diskon);
        this.barcode = barcode;
        this.expierd = expierd;
        this.kategori = kategori;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getExpierd() {
        return expierd;
    }

    public void setExpierd(String expierd) {
        this.expierd = expierd;
    }

    public ArrayList<Kategori> getKategori() {
        return kategori;
    }

    public void setKategori(ArrayList<Kategori> kategori) {
        this.kategori = kategori;
    }

    public void isExpired(){

    }

    public void addKategori(){

    }
}
