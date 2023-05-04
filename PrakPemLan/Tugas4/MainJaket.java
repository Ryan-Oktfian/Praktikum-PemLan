package Tugas4;

import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("====================");
        System.out.println("  Labkomdas Store");
        System.out.println("====================");

        System.out.println("Menu : ");
        System.out.println("1. Pricelist");
        System.out.println("2. Beli");
        System.out.print("Pilihan Anda : ");
        byte pil = input.nextByte();
        System.out.println();

        switch(pil){
            case 1 : {
                Jaket.pricelist();
                break;
            }
            case 2 : {
                Jaket.beliJaket();
                break;
            }
            default : System.out.println("ERROR");
        }
    }
}