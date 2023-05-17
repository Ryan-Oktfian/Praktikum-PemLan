package Tugas5;

public class Main {
    public static void main(String[] args) {
        // Manusia a = new Manusia("A", "111", true, true);
        // System.out.println(a);
        // System.out.println();

        // MahasiswaFILKOM b = new MahasiswaFILKOM("B", "111", false, false, "165150300111100", 4.0);
        // System.out.println(b);
        // System.out.println();

        // Pekerja c = new Pekerja("C", "111", true, true, 1000, 4, 2016, 3, 2);
        // System.out.println(c);
        // System.out.println();

        // Manager d = new Manager("D", "111", true, true, 1000, 3, "HRD", 2017, 1, 2);
        // System.out.println(d);
        // System.out.println();

        Manusia a = new Manusia("Mr. John", "123456789", true, true);
        Manusia b = new Manusia("Mrs. Adele", "987654321", false, true);
        Manusia c = new Manusia("Mr. Wick", "2357111317", true, false);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println();

        MahasiswaFILKOM e = new MahasiswaFILKOM("Mr. Ryan", "1111111111", true, false, "225150701111031", 2.9);
        MahasiswaFILKOM f = new MahasiswaFILKOM("Mr. Ryan", "1111111111", true, false, "225150701111031", 3.4);
        MahasiswaFILKOM g = new MahasiswaFILKOM("Mr. Ryan", "1111111111", true, false, "225150701111031", 4.0);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println();

        Pekerja h = new Pekerja("Mr. Bob", "2468101214", true, true, 1000, 2, 2021, 1, 1);
        Pekerja i = new Pekerja("Mrs. Anna", "13579111315", false, false, 4000, 0, 2014, 1, 1);
        Pekerja j = new Pekerja("Mr. Bean", "73645612366", true, true, 9000, 10, 2003, 1, 1);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println();

        Manager k = new Manager("Mrs. Linda", "325424970", false, false, 7500, 0, "Senior Manager", 2008, 1, 1);
        System.out.println(k);
        System.out.println();


    }
}
