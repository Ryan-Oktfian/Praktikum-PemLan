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

    void narikBus(){}

    public void mengemudi(Bus bus){
        System.out.println(this.nama +" mengendarai bus merk " +bus.merk);
    }
}

class DriverAngkot extends Orang{

    public DriverAngkot(String nama, int umur){
        super(nama, umur);
    }

    void narikAngkot(){}

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

    public Mobil(String platNomor, String merk){
        this.platNomor = platNomor;
        this.merk = merk;
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
    int jmlPenumpang;
    DriverAngkot supir;
    Penumpang[] daftarPenumpang;

    public Angkot(String platNomor, String merk, int jmlPenumpang, DriverAngkot supir){
        super(platNomor, merk);
        this.jmlPenumpang = jmlPenumpang;
        this.supir = supir;
        this.daftarPenumpang = new Penumpang[jmlPenumpang];
    }

    public void tambahPenumpang(Penumpang a){}

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
    int jmlPenumpang;
    DriverBus supir;
    Penumpang[] daftarPenumpang;

    public Bus(String platNomor, String merk, int jmlPenumpang, DriverBus supir){
        super(platNomor, merk);
        this.jmlPenumpang = jmlPenumpang;
        this.supir = supir;
        this.daftarPenumpang = new Penumpang[jmlPenumpang];
    }

    public void tambahPenumpang(Penumpang a){}

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

public class AsAgCom {
    public static void main(String[] args) {
        // obj drv bus
        DriverBus supirBus = new DriverBus("Pak A", 40);

        // obj bus
        Bus bus1 = new Bus("H 1234 QW", "Hino", 35, supirBus);

        // obj penumpang
        Penumpang penumpang1 = new Penumpang("Pak S", 40);
        Penumpang penumpang2 = new Penumpang("Pak D", 40);

        // tambah pnp ke bus
        bus1.tambahPenumpang(penumpang1);
        bus1.tambahPenumpang(penumpang2);

        // onj drv angkot
        DriverAngkot supirAngkot = new DriverAngkot("Pak F", 40);

        // obj angkot
        Angkot angkot1 = new Angkot("H 5678 ER", "Isuzu Panther", 12, supirAngkot);

        // tambah pnp ke angkot
        angkot1.tambahPenumpang(penumpang1);
        angkot1.tambahPenumpang(penumpang2);

        // mengemudi
        supirBus.mengemudi(bus1);
        supirAngkot.mengemudi(angkot1);

        // info kendaraan
        System.out.println("Bus " +bus1.getMerk() +" dengan plat nomor " +bus1.getPlatNomor() +" memiliki kapasitas penumpang " +bus1.getJmlPenumpang());
        System.out.println("Angkot " +angkot1.getMerk() +" dengan plat nomor " +bus1.getPlatNomor() +" memiliki kapasitas penumpang " +bus1.getJmlPenumpang());

        // tampilkan informasi
        System.out.println("Penumpang di dalam bus : ");
        for (Penumpang x : bus1.getDaftarPenumpang()){
            if(x != null){
                System.out.println("- " +x.getNama());
            }
        }

        System.out.println("Penumpang di dalam angkot : ");
        for (Penumpang y : angkot1.getDaftarPenumpang()){
            if(y != null){
                System.out.println("- " +y.getNama());
            }
        }
    } 
}
