package Tugas4;

import java.util.Scanner;

public class Jaket {
    private final int JaketA = 100000;
    private final int JaketB = 125000;
    private final int JaketC = 175000;

    public int getJaketA() {
        return JaketA;
    }
    public int getJaketB() {
        return JaketB;
    }
    public int getJaketC() {
        return JaketC;
    }

    static void pricelist(){
        Scanner input = new Scanner(System.in);
        System.out.println("======= PRICELIST =======");
        System.out.println("Jaket A : Rp100.000 / item");
        System.out.println("Jaket B : Rp125.000 / item");
        System.out.println("Jaket C : Rp175.000 / item");

        System.out.println("========= Diskon Khusus Ramadhan!!! =========");
        System.out.println("========= Berlaku Untuk Pembelian Diatas 100 item! =========\n");

        System.out.println("Jaket A : Rp95.000 / item");
        System.out.println("Jaket B : Rp120.000 / item");
        System.out.println("Jaket C : Rp160.000 / item");
        System.out.println();
        System.out.println("Lanjut beli? (ya/ tidak)");
        String pil1 = input.next();
        if(pil1.equalsIgnoreCase("ya")) {
            beliJaket();
        } else if(pil1.equalsIgnoreCase("tidak")) {
            System.out.println("selesai");
        } else System.out.println("ERROR");
    }

    static void beliJaket(){
        Jaket jaket1 = new Jaket();
        Scanner input = new Scanner(System.in);
        
        int hargaSatuan = 0;
        int hargaAkhir = 0;
        int jml = 0;
        
        System.out.println();
        System.out.println("======= STORE =======");
        System.out.println("Tipe jaket yang dibeli : ");
        String tipe = input.next();

        if(tipe.equalsIgnoreCase("a") || tipe.equalsIgnoreCase("b") || tipe.equalsIgnoreCase("c")){
            System.out.println("Jumlah jaket yang dibeli : ");
            jml = input.nextInt();
            
            if(tipe.equalsIgnoreCase("A")){
                if(jml > 100){
                    hargaSatuan = 95000;
                    hargaAkhir = hargaSatuan * jml;
                } else{
                    hargaSatuan = jaket1.getJaketA();
                    hargaAkhir = jaket1.getJaketA() * jml;
                }
            }
            else if(tipe.equalsIgnoreCase("B")){
                if(jml > 100){
                    hargaSatuan = 120000;
                    hargaAkhir = hargaSatuan * jml;
                }
                else{
                    hargaSatuan = jaket1.getJaketB();
                    hargaAkhir = jaket1.getJaketB() * jml;
                }
            }
            else if(tipe.equalsIgnoreCase("C")){
                if(jml > 100){
                    hargaSatuan = 160000;
                    hargaAkhir = hargaSatuan * jml;
                }
                else{
                    hargaSatuan = jaket1.getJaketC();
                    hargaAkhir = jaket1.getJaketC() * jml;
                }
            }
            System.out.println("Akhiri belanja? (ya/ tidak)");
            String pil2 = input.next();
            if(pil2.equalsIgnoreCase("ya")){
                System.out.println();
                System.out.println("======= RESUME =======");
                System.out.println("Pesanan Anda : Jaket " +tipe);
                System.out.println("Jumlah pesanan : " +jml +" item");
                System.out.println("Harga satuan : " +hargaSatuan +" / item");
                System.out.println("Harga Total : Rp" +hargaAkhir);
            } else if(pil2.equalsIgnoreCase("tidak")){
                beliJaket();
                System.out.println();
            }
        }
        else {
            System.out.println("ERROR");
        }
    }
}
