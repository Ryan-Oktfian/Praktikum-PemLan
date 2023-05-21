package Tugas6;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.getHarga() * this.jumlah * 2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\nJenis Kue\t : Kue Jadi";
    }
    
}
