

public class mainBook {
    public static void main(String[] args) {
        
        String teknologi[][] = {{"Teknologi", "Mengenal Teknologi: Teknologi Informasi", "Suryana, D.", "2012"},
                                {"Teknologi", "Teknologi Wireless Communication dan Wireless Broadband", "Wardhana, L, dkk.", "2010"},
                                {"Teknologi", "Sistem Peralatan Hidup dan Teknologi: Seri Pengantar Studi Kebuyaan", "Liliweri, A.", "2021"},
                                {"Teknologi", "Media dan Teknologi Pembelajaran", "Yaumi, M.", "2018"},
                                {"Teknologi", "Teknologi Informasi dan Sistem Informasi Manajemen", "Simarmata, J dkk.", "2020"}};
        
        String filsafat[][] = {{"Filsafat", "Pokok-pokok filsafat hukum", "Darmodiharjo, D dkk.", "1995"},
                               {"Filsafat", "Filsafat Umum", "Muliadi", "2020"},
                               {"Filsafat", "Filsafat Modern", "Hardiman, F", "2004"},
                               {"Filsafat", "Filsafat Jawa: Menggali Butir-Butir Kearifan Lokal", "Astiyanto, H", "2006"},
                               {"Filsafat", "Filsafat Bahasa", "Sadapotto, A dkk.", "2021"}};
        
        String sejarah[][] = {{"Sejarah", "Sejarah Pendidikan Islam", "Rozy, F", "1986"},
                              {"Sejarah", "Sejarah Pendidikan Kristen di Batak", "Aritonang, J", "1988"},
                              {"Sejarah", "Metodologi Sejarah", "Kuntowijoyo", "2003"},
                              {"Sejarah", "Sejarah Pergerakan Nasional Indonesia", "Hardjosatoto, S", "1985"},
                              {"Sejarah", "NSejarah Revolusi Nasional", "Dekker, I", "1980"}};

        String agama[][] = {{"Agama", "Agama dan Perubahan Sosial", "Syarif, M", "2020"},
                            {"Agama", "Psikologi Agama", "Masduki, Y dkk.", "2020"},
                            {"Agama", "Pluralisme Menyelamatkan Agama-Agama", "Shofan, M", "2011"},
                            {"Agama", "Agama untuk Peradaban", "Hidayat, K", "2019"},
                            {"Agama", "Pengantar Teologi Agama-Agama", "Novalina, M", "2019"}};
        
        String psikologi[][] = {{"Psikologi", "Psikologi Umum Dasar", "Syaifuddin, A", "2022"},
                                {"Psikologi", "Psikologi Pendidikan", "Rahmat, P", "2021"},
                                {"Psikologi", "Psikologi Komunikasi", "Putriana, A dkk.", "2021"},
                                {"Psikologi", "Psikologi Agama", "Mulyadi, dkk.", "2021"},
                                {"Psikologi", "Psikologi Sastra", "Siswanto, W dkk.", "2021"}}; 
        
        String politik[][] = {{"Politik", "Menuju Kekuatan Utama Dunia", "Yuliantoro, N", "2021"},
                              {"Politik", "Politik bebas aktif: tantangan dan kesempatan", "Sabir, M", "1987"},
                              {"Politik", "Politik Pembangunan: Sebuah Analisis Konsep, Arah, dan Strategi", "Tjokrowinoto, M", "1987"},
                              {"Politik", "Mahasiswa dalam politik", "Harahap, M", "1990"},
                              {"Politik", "Politik dan BLBI", "Subagja, G", "2000"}};
        
        String fiksi[][] = {{"Fiksi", "Metode Karakterisasi Telaah Fiksi", "Minderop, A", "2005"},
                            {"Fiksi", "Teori Pengkajian Fiksi", "Nurgiyantoro, B", "2018"},
                            {"Fiksi", "Prosa Fiksi dan Drama", "Saputra, N dkk.", "2021"},
                            {"Fiksi", "Jalan Cinta Para Pejuang", "Salim A.", "2009"},
                            {"Fiksi", "Menulis Fiksi Itu Seksi", "Endah, A", "2013"}};
                            
        book tekno = new book();
        for (int row = 0; row < teknologi.length; row++) {
            tekno.setJudulBuku(teknologi[row][1]);
            tekno.setKategoriBuku(teknologi[row][0]);
            tekno.setPenulisBuku(teknologi[row][2]);
            tekno.setTahunTerbitBuku(teknologi[row][3]);
            tekno.display();
        }
        System.out.println();
        
        book filsaf = new book();
        for (int row = 0; row < filsafat.length; row++) {
            filsaf.setJudulBuku(filsafat[row][1]);
            filsaf.setKategoriBuku(filsafat[row][0]);
            filsaf.setPenulisBuku(filsafat[row][2]);
            filsaf.setTahunTerbitBuku(filsafat[row][3]);
            filsaf.display();
        }
        System.out.println();

        book sej = new book();
        for (int row = 0; row < sejarah.length; row++) {
            sej.setJudulBuku(sejarah[row][1]);
            sej.setKategoriBuku(sejarah[row][0]);
            sej.setPenulisBuku(sejarah[row][2]);
            sej.setTahunTerbitBuku(sejarah[row][3]);
            sej.display();
        }
        System.out.println();

        book agam = new book();
        for (int row = 0; row < agama.length; row++) {
            agam.setJudulBuku(agama[row][1]);
            agam.setKategoriBuku(agama[row][0]);
            agam.setPenulisBuku(agama[row][2]);
            agam.setTahunTerbitBuku(agama[row][3]);
            agam.display();
        }
        System.out.println();
        
        book psiko = new book();
        for (int row = 0; row < psikologi.length; row++) {
            psiko.setJudulBuku(psikologi[row][1]);
            psiko.setKategoriBuku(psikologi[row][0]);
            psiko.setPenulisBuku(psikologi[row][2]);
            psiko.setTahunTerbitBuku(psikologi[row][3]);
            psiko.display();
        }
        System.out.println();
        
        book poli = new book();
        for (int row = 0; row < politik.length; row++) {
            poli.setJudulBuku(politik[row][1]);
            poli.setKategoriBuku(politik[row][0]);
            poli.setPenulisBuku(politik[row][2]);
            poli.setTahunTerbitBuku(politik[row][3]);
            poli.display();
        }
        System.out.println();

        book fiks = new book();
        for (int row = 0; row < fiksi.length; row++) {
            fiks.setJudulBuku(fiksi[row][1]);
            fiks.setKategoriBuku(fiksi[row][0]);
            fiks.setPenulisBuku(fiksi[row][2]);
            fiks.setTahunTerbitBuku(fiksi[row][3]);
            fiks.display();
        }
        System.out.println();
    }
}    
