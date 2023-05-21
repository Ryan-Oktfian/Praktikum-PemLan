package Tugas6;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }
    
    @Override
    public double hitungHarga() {
        // TODO Auto-generated method stub
        return super.getHarga() * this.berat;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\nJenis Kue\t : Kue Pesanan";
    }
    
}
