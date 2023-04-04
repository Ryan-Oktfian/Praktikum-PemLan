import java.util.Scanner;

class Lingkaran{
    private double jari2;
    final double PI = Math.PI;

    Lingkaran(double jari2){
        this.jari2 = jari2;
    }

    public double luasLingkaran(){
        return Math.PI * jari2 * jari2;
    }

    public double getJari2() {
        return jari2;
    }
}

class PersegiPanjang{
    private int panjang;
    private int lebar;

    PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPersegiPanjang(){
        return panjang * lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
}

public class mainObjek1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari2;
        int panjang;
        int lebar;

        System.out.print("Jari2 kepala robot : ");
        jari2 = input.nextDouble();
        Lingkaran kepala = new Lingkaran(jari2);

        System.out.print("Panjang dan lebar badan : ");
        panjang = input.nextInt();
        lebar = input.nextInt();
        PersegiPanjang badan = new PersegiPanjang(panjang, lebar);

        System.out.print("Panjang dan lebar tangan kiri : ");
        panjang = input.nextInt();
        lebar = input.nextInt();
        PersegiPanjang tanganKiri = new PersegiPanjang(panjang, lebar);

        System.out.print("Panjang dan lebar tangan kanan : ");
        panjang = input.nextInt();
        lebar = input.nextInt();
        PersegiPanjang tanganKanan = new PersegiPanjang(panjang, lebar);
        
        System.out.print("Jari2 telapak tangan kiri : ");
        jari2 = input.nextDouble();
        Lingkaran telapakTanganKiri = new Lingkaran(jari2);

        System.out.print("Jari2 telapak tangan kanan : ");
        jari2 = input.nextDouble();
        Lingkaran telapakTanganKanan = new Lingkaran(jari2);

        System.out.print("Panjang dan lebar kaki kiri : ");
        panjang = input.nextInt();
        lebar = input.nextInt();
        PersegiPanjang kakiKiri = new PersegiPanjang(panjang, lebar);

        System.out.print("Panjang dan lebar kaki kanan : ");
        panjang = input.nextInt();
        lebar = input.nextInt();
        PersegiPanjang kakiKanan = new PersegiPanjang(panjang, lebar);

        System.out.print("Jari2 telapak kaki kanan : ");
        jari2 = input.nextDouble();
        Lingkaran telapakKakiKiri = new Lingkaran(jari2);

        System.out.print("Jari2 telapak kaki kanan : ");
        jari2 = input.nextDouble();
        Lingkaran telapakKakiKanan = new Lingkaran(jari2);

        double hitungLuas = kepala.luasLingkaran() + badan.luasPersegiPanjang() 
                            + tanganKiri.luasPersegiPanjang() + tanganKanan.luasPersegiPanjang() 
                            + telapakTanganKiri.luasLingkaran() + telapakTanganKanan.luasLingkaran()
                            + kakiKiri.luasPersegiPanjang() + kakiKanan.luasPersegiPanjang()
                            + telapakKakiKiri.luasLingkaran() + telapakKakiKanan.luasLingkaran();
        
        double tinggiRobot = (telapakKakiKanan.getJari2()*2) + kakiKanan.getLebar() + badan.getLebar() + (kepala.getJari2()*2);

        System.out.println("Luas robot secara keseluruhan adalah : " +hitungLuas);
        System.out.println("Tinggi robot secara keseluruhan adalah : " +tinggiRobot);
        input.close();
    }
}