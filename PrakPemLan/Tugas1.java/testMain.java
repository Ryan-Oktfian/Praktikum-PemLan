/**
 * MainOOP
 */
public class testMain {
    public static void main(String[] args) {
        // instansiasi
        testPersegiPanjang pp = new testPersegiPanjang();

        // set nilai atribut
        pp.setPanjang(10);
        pp.setLebar(5);

        pp.display();
        /**
         * Output:
         * Panjang Persegi Panjang: 10
         * Lebar Persegi Panjang: 5
         * Luas Persegi Panjang: 50
         * Keliling Persegi Panjang: 30
         */
    }
}