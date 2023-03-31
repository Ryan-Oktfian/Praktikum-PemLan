package tugas3;

import java.util.Scanner;

public class mainHero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Silakan masukkan hero Anda!");
        System.out.println("===========================");

        Hero heroPlayer = new Hero();
        System.out.print("Hero Name : ");
        heroPlayer.setNama(input.nextLine());
        System.out.print("Health : ");
        heroPlayer.setNyawa(input.nextDouble());
        System.out.print("Attack : ");
        heroPlayer.setSerangan(input.nextDouble());
        System.out.print("Defense : ");
        heroPlayer.setKekebalan(input.nextDouble());
        
        System.out.println("Silakan masukkan hero lawan!");
        System.out.println("===========================");

        System.out.print("Hero Name : ");
        String nama = input.next();
        System.out.print("Health : ");
        double nyawa = input.nextDouble();
        System.out.print("Attack : ");
        double serangan = input.nextDouble();
        System.out.print("Defense : ");
        double kekebalan = input.nextDouble();
        Hero heroLawan = new Hero(nama, nyawa, serangan, kekebalan);
        
        int i = 0;
        while (heroPlayer.getNyawa() > 0 && heroLawan.getNyawa() > 0) {
            i++;
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Ronde " +i);

            heroPlayer.serang(heroLawan);
            if(heroLawan.getNyawa() <= 0) break;
            
            i++;
            System.out.println("===========================");
            System.out.println("===========================");
            System.out.println("Ronde " + i);  

            heroLawan.serang(heroPlayer);
            if(heroPlayer.getNyawa() <= 0) break;
        
        }
        i++;

        System.out.println("Pertarungan telah usai");
        if(heroPlayer.getNyawa() <= 0){
            System.out.println(heroPlayer.getNama() +" telah kalah!");
            System.out.println("============================");
            System.out.println(heroLawan.getNama() +" adalah pemenangnya");
        }
        else if(heroLawan.getNyawa() <= 0){
            System.out.println(heroLawan.getNama() +" telah kalah!");
            System.out.println("============================");
            System.out.println(heroPlayer.getNama() +" adalah pemenangnya");
        }
        input.close();
    }
}
