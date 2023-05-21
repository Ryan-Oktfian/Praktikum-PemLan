package Tugas6;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }

    public abstract double hitungHarga();

    public String toString() {
        return "\nNama Kue\t : " +getNama() +"\nHarga Kue\t : Rp" +getHarga() ;
    }
    
}
