package Tugas5;

public class MahasiswaFILKOM extends Manusia{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk){
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }
    public double getIpk() {
        return ipk;
    }

    public String getStatus(){
        String angkatan = "";
        String prodi = "";
        char angkaAngkatan = nim.charAt(1);
        char angkaProdi = nim.charAt(6);

        if (nim.charAt(0) == '1') {
            switch (angkaAngkatan) {
                case '6':
                    angkatan = "2016";
                    break;
                case '7':
                    angkatan = "2017";
                    break;
                case '8':
                    angkatan = "2018";
                    break;
                case '9':
                    angkatan = "2019";
                    break;
            }
        } else if (nim.charAt(0) == '2') {
            switch (angkaAngkatan) {
                case '0':
                    angkatan = "2020";
                    break;
                case '1':
                    angkatan = "2021";
                    break;
                case '2':
                    angkatan = "2022";
                    break;
            }
        }

        switch (angkaProdi) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa(){
        double beasiswa = 0;
        if(ipk <= 3.5 && ipk >= 3.0){
            beasiswa = 50;
        } else if(ipk <= 4 && ipk > 3.5){
            beasiswa = 75;
        }
        return beasiswa;
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\nNIM\t\t  : " +getNim() +"\nIPK\t\t  : " +getIpk() +"\nStatus\t\t  : " +getStatus();
    }
}
