package Tugas6;

public class Main {
    public static void main(String[] args) {
        double totalBerat = 0;
        double totalJumlah = 0;
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double hargaKueTermahal = 0;
        Kue kueTermahal = null;

        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KueJadi("Bolu kukus", 3000, 2);
        daftarKue[1] = new KueJadi("Pisang bolen", 3000, 2);
        daftarKue[2] = new KueJadi("Kue cucur", 2000, 3);
        daftarKue[3] = new KueJadi("Kue cenil", 2000, 3);
        daftarKue[4] = new KueJadi("Lupis", 3000, 2);
        daftarKue[5] = new KueJadi("Klepon", 3000, 2);
        daftarKue[6] = new KueJadi("Onde-onde", 2000, 3);
        daftarKue[7] = new KueJadi("Lemper", 2000, 3);
        daftarKue[8] = new KueJadi("Dadar gulung", 3000, 2);
        daftarKue[9] = new KueJadi("Nagasari", 2000, 3);
        daftarKue[10] = new KuePesanan("Kue tart", 60000, 1);
        daftarKue[11] = new KuePesanan("Kue talam", 3000, 0.2);
        daftarKue[12] = new KuePesanan("Lapis legit", 50000, 1);
        daftarKue[13] = new KuePesanan("Bikang", 2000, 0.2);
        daftarKue[14] = new KuePesanan("Serabi", 2000, 0.5);
        daftarKue[15] = new KuePesanan("Mendut", 2000, 0.5);
        daftarKue[16] = new KuePesanan("Wajik", 2000, 0.5);
        daftarKue[17] = new KuePesanan("Kue putu", 2000, 0.2);
        daftarKue[18] = new KuePesanan("Lumpia", 5000, 0.5);
        daftarKue[19] = new KuePesanan("Apem", 2000, 0.3);
        
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            if(kue instanceof KuePesanan){
                totalBerat += ((KuePesanan) kue).getBerat();
                totalHargaPesanan += kue.hitungHarga();
            }
            if(kue instanceof KueJadi){
                totalJumlah += ((KueJadi) kue).getJumlah();
                totalHargaJadi += kue.hitungHarga();
            }
            if(kue.hitungHarga() > hargaKueTermahal){
                hargaKueTermahal = kue.hitungHarga();
                kueTermahal = kue;
            }
        }
        System.out.println("\nTotal Harga Semua Kue\t  : Rp" +(totalHargaPesanan + totalHargaJadi));
        System.out.println();
        System.out.println("Total Harga Kue Pesanan\t  : Rp" +totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan\t  : " +totalBerat + " kg");
        System.out.println();
        System.out.println("Total Harga Kue Jadi\t  : Rp" +totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi\t  : " +totalJumlah + " buah");
        System.out.println();
        System.out.println("Kue Termahal\t : " +kueTermahal);
    }
}
