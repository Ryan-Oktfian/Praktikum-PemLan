package Collections;

import java.util.*;

class Orang{
    protected String nama;
    protected int umur;

    public Orang(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void info(){
        System.out.println("Nama : " +nama);
        System.out.println("Umur : " +umur);
    }

    public String getNama() {
        return nama;
    }
}

class DriverBus extends Orang{

    public DriverBus(String nama, int umur){
        super(nama, umur);
    }

    public void mengemudi(Bus bus){
        System.out.println(this.nama +" mengendarai bus merk " +bus.merk);
    }
}

class DriverAngkot extends Orang{

    public DriverAngkot(String nama, int umur){
        super(nama, umur);
    }

    public void mengemudi(Angkot angkot){
        System.out.println(this.nama +" mengendarai angkot merk " +angkot.merk);
    }
}

class Penumpang extends Orang{

    public Penumpang(String nama, int umur){
        super(nama, umur);
    }

    void naik(){
        System.out.println(this.nama +" naik ke dalam kendaraan");
    }

    void turun(){
        System.out.println(this.nama +" turun dari");
    }
}

class Mobil{
    protected String platNomor;
    protected String merk;
    protected int jmlPenumpang;

    public Mobil(String platNomor, String merk, int jmlPenumpang){
        this.platNomor = platNomor;
        this.merk = merk;
        this.jmlPenumpang = jmlPenumpang;
    }

    public void info(){
        System.out.println("Merk : " +merk);
        System.out.println("Plat Nomor " +platNomor);
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }
}

class Angkot extends Mobil{
    //int jmlPenumpang;
    DriverAngkot supir;
    Penumpang[] daftarPenumpang;

    public Angkot(String platNomor, String merk, int jmlPenumpang){
        super(platNomor, merk, jmlPenumpang);
        this.daftarPenumpang = new Penumpang[jmlPenumpang];
    }

    public DriverAngkot getDriver(){
        return supir;
    }

    public void setDriver(DriverAngkot supir){
        this.supir = supir;
    }

    public void tambahPenumpang(Penumpang a){
        for(int i = 0; i < daftarPenumpang.length; i++){
            if(daftarPenumpang[i] == null){
                daftarPenumpang[i] = a;
                break;
            }
        }
    }

    public void info(){
        System.out.println("Jumlah penumpang : " +jmlPenumpang);
    }

    public int getJmlPenumpang() {
        return jmlPenumpang;
    }

    public Penumpang[] getDaftarPenumpang() {
        return daftarPenumpang;
    }
}

class Bus extends Mobil{
    //int jmlPenumpang;
    DriverBus supir;
    Penumpang[] daftarPenumpang;

    public Bus(String platNomor, String merk, int jmlPenumpang){
        super(platNomor, merk, jmlPenumpang);
        this.daftarPenumpang = new Penumpang[jmlPenumpang];
    }

    public DriverBus getDriver(){
        return supir;
    }

    public void setDriver(DriverBus supir){
        this.supir = supir;
    }

    public void tambahPenumpang(Penumpang a){
        for(int i = 0; i < daftarPenumpang.length; i++){
            if(daftarPenumpang[i] == null){
                daftarPenumpang[i] = a;
                break;
            }
        }
    }

    public void info(){
        System.out.println("Jumlah penumpang : " +jmlPenumpang);
    }
    
    public int getJmlPenumpang() {
        return jmlPenumpang;
    }

    public Penumpang[] getDaftarPenumpang() {
        return daftarPenumpang;
    }
}

public class TugasLK3 {
    public static void main(String[] args) {

        ArrayList<Angkot> daftarAngkot = new ArrayList<Angkot>();
        daftarAngkot.add(new Angkot("H 00 H", "Suzuki Carry", 10));
        daftarAngkot.add(new Angkot("H 33 H", "Isuzu Panther", 12));
        
        ArrayList<DriverAngkot> drvA = new ArrayList<DriverAngkot>();
        drvA.add(new DriverAngkot("Alex",30));
        drvA.add(new DriverAngkot("Jason",35));

        daftarAngkot.get(0).setDriver(drvA.get(0));
        daftarAngkot.get(1).setDriver(drvA.get(1));

        for (Angkot angkot : daftarAngkot) {
            System.out.println("Merk: " + angkot.getMerk());
            System.out.println("Plat Nomor: " + angkot.getPlatNomor());
            System.out.println("Jumlah Penumpang: " + angkot.getJmlPenumpang());
            System.out.println("Driver: " + angkot.getDriver().getNama());
            System.out.println();
        }

        ArrayList<Bus> daftarBus = new ArrayList<Bus>();
        daftarBus.add(new Bus("H 41 SYG", "Mercedes-Benz", 20));
        daftarBus.add(new Bus("H 471 YOK", "Volvo", 11));
        
        ArrayList<DriverBus> drvB = new ArrayList<DriverBus>();
        drvB.add(new DriverBus("Bruce",40));
        drvB.add(new DriverBus("Tom",45));

        daftarBus.get(0).setDriver(drvB.get(0));
        daftarBus.get(1).setDriver(drvB.get(1));

        for (Bus Bus : daftarBus) {
            System.out.println("Merk: " + Bus.getMerk());
            System.out.println("Plat Nomor: " + Bus.getPlatNomor());
            System.out.println("Jumlah Penumpang: " + Bus.getJmlPenumpang());
            System.out.println("Driver: " + Bus.getDriver().getNama());
            System.out.println();
        }

        Queue<Angkot> antriAngkot = new LinkedList<>();
        antriAngkot.add(daftarAngkot.get(0));
        antriAngkot.add(daftarAngkot.get(1));

        int nomorAntri = 0;
        System.out.println("Daftar Antrian Angkot: ");
        for (Angkot angkot : antriAngkot) {
            System.out.println(++nomorAntri + ". " + angkot.getMerk() + " dengan pengemudi " +angkot.getDriver().getNama());
        }

        Queue<Bus> antriBus = new LinkedList<>();
        antriBus.add(daftarBus.get(0));
        antriBus.add(daftarBus.get(1));

        nomorAntri = 0;
        System.out.println("\nDaftar Antrian Bus: ");
        for (Bus bus : antriBus) {
            System.out.println(++nomorAntri +". " +bus.getMerk() +" dengan pengemudi " +bus.getDriver().getNama());
        }
    }
}
