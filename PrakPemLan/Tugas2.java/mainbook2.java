

public class mainbook2 {
    public static void main(String[] args) {
        
        String teknologi[][] = {{"Teknologi", "Mengenal Teknologi: Teknologi Informasi", "Suryana, D.", "2012", "Sejarah teknologi dapat kita bagi ke dalam masa pra-sejarah, masa sejarah, dan masa modern."},
                                {"Teknologi", "Teknologi Wireless Communication dan Wireless Broadband", "Wardhana, L, dkk.", "2010", "Manusia tempo dulu sampai dengan sekarang tidak 'alergi' terhadap teknologi."},
                                {"Teknologi", "Sistem Peralatan Hidup dan Teknologi: Seri Pengantar Studi Kebudayaan", "Liliweri, A.", "2021", "3 aspek yang dipengaruhi oleh wireless boarband, yaitu gaya hidup, kebutuhan hidup, dan lingkungan hidup."},
                                {"Teknologi", "Media dan Teknologi Pembelajaran", "Yaumi, M.", "2018", "Keragaman pemahaman media pembelajaran  tersirat dari penyebutan media yang kadang-kadang disamakan dengan teknologi, alat peraga, dan sumber belajar."},
                                {"Teknologi", "Teknologi Informasi dan Sistem Informasi Manajemen", "Simarmata, J dkk.", "2020", "Teknologi adalah sebuah pengetahuan yang ditujukan untuk menciptakan alat, tindakan pengolahan, dan ekstraksi benda."}};
        
        String filsafat[][] = {{"Filsafat", "Pokok-pokok filsafat hukum", "Darmodiharjo, D dkk.", "1995", "Filsafat hukum adalah sub cabang dari filsafat manusia, yang disebut etika atau atau filsafat tingkah laku."},
                               {"Filsafat", "Filsafat Umum", "Muliadi", "2020", "Filsafat bisa dimengerti dengan sifat-sifat yang dilahirkan dan melekat padanya dan tanpanya, ia tak terpahami."},
                               {"Filsafat", "Filsafat Modern: dari Machiavelli sampai Nietzsche", "Hardiman, F", "2004", "Filsafat modern dirintis dalam beberapa tahapan zaman yang diwarnai oleh gerakan sosial-politis yang sangat kritis terhadap zaman sebelumnya."},
                               {"Filsafat", "Filsafat Jawa: Menggali Butir-Butir Kearifan Lokal", "Astiyanto, H", "2006", "Filsafat Jawa bagi orang-orang yang membahas dunia pewayangan tidak pernah ditemukan kesamaan pendapat, karena titik tolaknya berbeda."},
                               {"Filsafat", "Filsafat Bahasa", "Sadapotto, A dkk.", "2021", "Filsafat bahasa merupakan penyelidikan secara mendalam terhadap bahasa yang digunakan dalam filsafat."}};
        
        String sejarah[][] = {{"Sejarah", "Sejarah Pendidikan Islam", "Pulungan, J", "2019", "Sejarah pendidikan Islam merupakan ilmu pengetahuan yang membahas tentang pertumbuhan dan perkembangan pendidikan Islam, baik dari segi konsep, ide, maupun lembaga penyelenggaranya."},
                              {"Sejarah", "Sejarah Dunia yang Disembunyikan", "Black, J", "2015", "Bagaimana jika sejarah—atau apa yang kita ketahui sebagai sejarah—ditulis oleh orang yang salah?"},
                              {"Sejarah", "Api Sejarah 2", "Suryanegara, A", "2017", "Perjuangan jihad para Ulama Warosatul Ambiya bersama santri membangun kesatuan dan persatuan dalam membela NKRI."},
                              {"Sejarah", "Sejarah kesusastraan Melayu klasik", "Liaw, Y dkk", "2011", "Sejarah Kesusastraan Melayu Klasik memperkenalkan, mendokumentasikan, dan membahas berbagai naskah, sumber, pertumbuhan, demografi, dan berbagai pemikiran mengenai kesusastraan Melayu klasik."},
                              {"Sejarah", "Sapiens Grafis: Kelahiran Umat Manusia", "Harari, Y", "2021", "Bagaimana cara Homo sapiens berkembang menjadi penguasa planet Bumi, melakukan berbagai hal luar biasa seperti membelah atom, terbang ke Bulan, dan merekayasa genetika kehidupan?"}};

        String agama[][] = {{"Agama", "Agama dan Perubahan Sosial", "Syarif, M", "2020", "Kalangan terpelajar Indonesia menimba ilmu di Eropa dan Amerika, lalu membawa gagasan serta gerakan pembaharuan di Indonesia, baik melalui lembaga pendidikan, maupun organisasi sosial."},
                            {"Agama", "Psikologi Agama", "Masduki, Y dkk.", "2020", "Psikologi agama merupakan cabang psikologi yang meneliti tingkah laku manusia dalam hubungan dengan pengaruh keyakinan terhadap agama yang dianutnya serta dalam kaitannya dengan perkembangan usia masing-masing"},
                            {"Agama", "Pluralisme Menyelamatkan Agama-Agama", "Shofan, M", "2011", " Jika setiap individu dan kelompok pemeluk agama berusaha untuk memenangkan agamanya sendiri, maka kekecauan masyarakat akan terjadi."},
                            {"Agama", "Agama untuk Peradaban", "Hidayat, K", "2019", "Agama menjadi sumber inspirasi, fondasi, nilai, maupun etos yang menjaga keberlangsungan peradaban."},
                            {"Agama", "Pengantar Teologi Agama-Agama", "Novalina, M", "2019", "Kekristenan tidak hidup dalam kesendirian, melainkan selalu berinteraksi dengan agama yang lain, yang jika tidak mempunyai sikap yang baik dan toleransi, maka konflik akan menjadi tantangan yang sangat serius."}};
        
        String psikologi[][] = {{"Psikologi", "Psikologi Umum Dasar", "Syaifuddin, A", "2022", "Pemahaman bahwa psikologi sebagai ilmu yang mempelajari tentang kejiwaan manusia dimulai ketika psikologi belum menjadi ilmu yang mandiri dan masih menjadi cabang dari filsafat"},
                                {"Psikologi", "Psikologi Pendidikan", "Rahmat, P", "2021", "Psikologi pendidikan merupakan suatu ilmu yang khusus mengkaji perilaku individu dengan tujuan menemukan berbagai fakta, generalisasi, dan teori psikologi yang berkaitan dengan pendidikan melalui metode ilmiah tertentu."},
                                {"Psikologi", "Psikologi Komunikasi", "Putriana, A dkk.", "2021", "Psikologi komunikasi merupakan salah satu cabang dari dua ilmu pengetahuan penting, yaitu ilmu psikologi dan ilmu komunikasi."},
                                {"Psikologi", "Psikologi Agama", "Mulyadi, dkk.", "2021", "Pemahaman pendidik yang benar terhadap psikologi agama akan memberikan motivasi dan menuntun pendidik untuk mengetahui tingkat keberagamaan peserta didik, juga sebagai pedoman dalam memberikan ilmu pengetahuan agama bagi peserta didik."},
                                {"Psikologi", "Psikologi Sastra", "Siswanto, W dkk.", "2021", "Untuk seniman-seniman tertentu, psikologi membantu mengentalkan kepekaan mereka pada kenyataan, mempertajam kemampuan pengamatan, dan memberi kesempatan untuk menjajaki pola-pola yang belum terjamah sebelumnya."}}; 
        
        String politik[][] = {{"Politik", "Menuju Kekuatan Utama Dunia", "Yuliantoro, N", "2021", "Pembangunan ekonomi yang berlangsung dengan baik menimbulkan kepercayaan diri yang lebih kuat sehingga Cina berinisiatif untuk berperan lebih aktif di dunia internasional."},
                              {"Politik", "Demokrasi di Era Post Truth", "Gunawan, B dkk", "2021", "Di era post-truth emosi dan keyakinan personal lebih penting daripada fakta objektif dalam membangun opini publik, sehingga antara kebohongan dan kebenaran sulit diidentifikasi."},
                              {"Politik", "Politik Jatah Preman", "Wilson, I", "2018", "Selama masa Orde Baru, keberadaan geng, preman, dan milisi digunakan sebagai alat untuk menegakkan tertib sosial versi negara dan melanggengkan kekuasaan rezim, misalnya 'kewenangan'."},
                              {"Politik", "Pemikiran Politik Islam", "Iqbal, M", "2015", "Buku ini memuat elaborasi da eksplorasi pemikiran dan tokoh ketatanegaraan Islam, mulai dari periode Klasik seperti al-Farabi, al-Mawardi, dan lainnya; hingga era Modern seperti Jamaluddin al-Afghani, Muhammad Abduh, dan lainnya"},
                              {"Politik", "Marketing Politik: Antara Pemahaman dan Realitas", "Firmanzah", "2007", "Marketing politik telah menjadi fokus perhatian banyak kalangan, tidak hanya antara akademisi maupun praktisi, tetapi juga antara politisi dengan marketer."}};
        
        String fiksi[][] = {{"Fiksi", "Metode Karakterisasi Telaah Fiksi", "Minderop, A", "2005", "Buku ini menyampaikan selain metode telling danshowing-metode karakterisasi lainnya, yaitu melalui telaah gaya bahasa, teknik sudut pandang (point of view), dan teknik arus kesadaran (stream of consciousness)."},
                            {"Fiksi", "Teori Pengkajian Fiksi", "Nurgiyantoro, B", "2018", "Semua unsur intrinsik pendukung eksistensi sebuah karya fiksi saling berkaitan secara erat untuk secara bersama membentuk sebuah kemenyeluruhan indah dan padu."},
                            {"Fiksi", "Prosa Fiksi dan Drama", "Saputra, N dkk.", "2021", "Prosa atau fiksi memiliki arti sebuah karya naratif yang menceritakan sesuatu yang bersifat rekaan, khayalan, tidak berdasarkan kenyataan atau berarti suatu kenyataan yang lahir berdasarkan khayalan."},
                            {"Fiksi", "Orang-Orang Bloomington", "Darma, B", "2016", "Sejak kali pertama terbit, tujuh cerita yang dihimpun dalam antologi Orang-Orang Bloomington sukses memukau pembaca lintas generasi melalui permasalahan yang diangkat-emosi-emosi terdalam manusia."},
                            {"Fiksi", "Menulis Fiksi Itu Seksi", "Endah, A", "2013", "Selain telah masuk ke dalam atmosfer lifestyle masa kini, menulis fiksi juga menjadi sarana untuk membebaskan geliat seni menulis yang berkembang seiring dengan makin majunya kancah sosialisasi di dunia maya."}};
        
        
        for (int row = 0; row < teknologi.length; row++) {
            book2 tekno = new book2(teknologi[row][1], teknologi[row][0], teknologi[row][2], teknologi[row][3], teknologi[row][4]);
            tekno.display();
        }
        System.out.println();
        
        
        for (int row = 0; row < filsafat.length; row++) {
            book2 filsaf = new book2(filsafat[row][1], filsafat[row][0], filsafat[row][2], filsafat[row][3], filsafat[row][4]);
            filsaf.display();
        }
        System.out.println();

        
        for (int row = 0; row < sejarah.length; row++) {
            book2 sej = new book2(sejarah[row][1],  sejarah[row][0], sejarah[row][2], sejarah[row][3], sejarah[row][4]);
            sej.display();
        }
        System.out.println();

        
        for (int row = 0; row < agama.length; row++) {
            book2 agam = new book2(agama[row][1], agama[row][0], agama[row][2], agama[row][3], agama[row][4]);
            agam.display();
        }
        System.out.println();

        
        for (int row = 0; row < psikologi.length; row++) {
            book2 psiko = new book2(psikologi[row][1], psikologi[row][0], psikologi[row][2], psikologi[row][3], psikologi[row][4]);
            psiko.display();
        }
        System.out.println();
        
        
        for (int row = 0; row < politik.length; row++) {
            book2 poli = new book2(politik[row][1], politik[row][0], politik[row][2], politik[row][3], politik[row][4]);
            poli.display();
        }
        System.out.println();

        
        for (int row = 0; row < fiksi.length; row++) {
            book2 fiks = new book2(fiksi[row][1], fiksi[row][0], fiksi[row][2], fiksi[row][3], fiksi[row][4]);
            fiks.display();
        }
        System.out.println();
    }
}    
