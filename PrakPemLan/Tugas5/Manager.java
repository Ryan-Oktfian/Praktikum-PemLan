package Tugas5;

public class Manager extends Pekerja {
    private String department;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, int jumlahAnak, String department, int tahun, int bln, int tgl){
        super(nama, nik, jenisKelamin, menikah, gaji, jumlahAnak, tahun, bln, tgl);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() +(0.1 * this.getGaji());
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() +"\nDepartment\t  : " +department;
    }
}
