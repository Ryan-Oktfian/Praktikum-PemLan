/* Suatu perpustakaan di kampus X memiliki banyak koleksi buku, dan buku buku tersebut dikategorikan
berdasarkan jenisnya. Ada 7 kategori dalam perpustakaan tersebut, yaitu teknologi, filsafat, sejarah,
agama, psikologi, politik dan fiksi. Setiap kategori pastilah memiliki banyak buku. Setiap buku ditulis oleh
setidaknya 1 penulis, walaupun tak menutup kemungkinan buku tersebut ditulis oleh banyak penulis.
Dari studi kasus diatas, tentukan entitas-entitas yang terlibat beserta propertiesnya dan implementasikan
kedalam kode program, serta tampilkan ke layar nilai dari properties dari entitas tersebut. (Minimal tiap
kategori ada 5 buku) 
class buku, kategori ada teknologi, dll. */

public class book2{
    String judul;
    String kategori;
    String penulis;
    String tahunTerbit;
    String sinopsis;

    public book2(String JudulBuku, String KategoriBuku, String PenulisBuku, String TahunTerbitBuku, String SinopsisBuku){
        this.judul = JudulBuku;
        this.kategori = KategoriBuku;
        this.penulis = PenulisBuku;
        this.tahunTerbit = TahunTerbitBuku;
        this.sinopsis = SinopsisBuku;
    }
    
    public int hitungKata(String kalimat) {
        int jumlahKata = 0;
        
        if(kalimat != null && !kalimat.isEmpty()) {
            String[] kataArray = kalimat.split("\\s+");
            jumlahKata = kataArray.length;
        }   
        return jumlahKata;
    }

    public book2 copy(){
        book2 newBook = new book2(judul, kategori, penulis, tahunTerbit, sinopsis);
        return newBook;
    }

    public void display() {
       
        System.out.println("Kategori buku   : " +kategori);
        System.out.println("Judul buku      : " +judul);
        System.out.println("Penulis buku    : " +penulis);
        System.out.println("Tahun terbit    : " +tahunTerbit);
        System.out.println("Sinopsis buku   : " +sinopsis);
        System.out.println("Jumlah kata     : " +hitungKata(sinopsis));
        System.out.println();

        System.out.println("\t\t\t\t\t ========== Hasil Copy ==========");
        book2 bookAsli = new book2(judul, kategori, penulis, tahunTerbit, sinopsis);
        book2 bookCopy = bookAsli.copy();
        System.out.println("Kategori buku   : " +bookCopy.kategori);
        System.out.println("Judul buku      : " +bookCopy.judul);
        System.out.println("Penulis buku    : " +bookCopy.penulis);
        System.out.println("Tahun terbit    : " +bookCopy.tahunTerbit);
        System.out.println("Sinopsis buku   : " +bookCopy.sinopsis);
        System.out.println("Jumlah kata     : " +bookCopy.hitungKata(sinopsis));
        System.out.println();
    }
}
