package Tugas5;

import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private int jumlahAnak;
    private LocalDate tahunMasuk;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int jumlahAnak, int tahun, int bln, int tgl){
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
        tahunMasuk = LocalDate.of(tahun, bln, tgl);
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    public double getGaji() {
        return gaji;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public LocalDate getTahunMasuk() {
        return tahunMasuk;
    }

    public double getBonus(){
        double bonus = 0;
        int lamaKerja = 0;
        Period bedaWaktu = Period.between(tahunMasuk, LocalDate.now());
        lamaKerja = bedaWaktu.getYears();

        if(lamaKerja >= 0 && lamaKerja <= 5){
            bonus = 0.05 * gaji;
        } else if (lamaKerja >5 && lamaKerja <= 10){
            bonus = 0.1 * gaji;
        } else if(lamaKerja > 10){
            bonus = 0.15 * gaji;
        }
        return bonus;
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + (this.jumlahAnak * 20);
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() +getBonus() +getGaji();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\nTahun Masuk\t  : " +tahunMasuk +"\nJumlah Anak\t  : " +jumlahAnak +"\nGaji\t\t  : $" +gaji;
    }
}
