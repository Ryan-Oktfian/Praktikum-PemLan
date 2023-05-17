package Tugas5;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah){
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public String getNik() {
        return nik;
    }

    public String getJenisKelamin(){
        String jenisK = "";
        if (jenisKelamin == true){
            jenisK = "Laki-laki";
        } else
            jenisK = "Perempuan";
        return jenisK;
    }
    
    public String getMenikah(){
        String nikah = "";
        if(menikah == true){
            nikah = "Menikah";
        } else
            nikah = "Belum Menikah";
        return nikah;
    }

    public double getTunjangan(){
        double tunjangan = 0;
        if(menikah == true){
            if(jenisKelamin == true){
                tunjangan = 25;
            } else if(jenisKelamin == false){
                tunjangan = 20;
            } 
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String toString() {
        return "\nNama\t\t  : " +getNama() +"\nNIK\t\t  : " +getNik() +"\nJenis Kelamin\t  : " +getJenisKelamin() +"\nJumlah Pendapatan : $" +getPendapatan();
    }
}
