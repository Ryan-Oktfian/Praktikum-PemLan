/* Suatu perpustakaan di kampus X memiliki banyak koleksi buku, dan buku buku tersebut dikategorikan
berdasarkan jenisnya. Ada 7 kategori dalam perpustakaan tersebut, yaitu teknologi, filsafat, sejarah,
agama, psikologi, politik dan fiksi. Setiap kategori pastilah memiliki banyak buku. Setiap buku ditulis oleh
setidaknya 1 penulis, walaupun tak menutup kemungkinan buku tersebut ditulis oleh banyak penulis.
Dari studi kasus diatas, tentukan entitas-entitas yang terlibat beserta propertiesnya dan implementasikan
kedalam kode program, serta tampilkan ke layar nilai dari properties dari entitas tersebut. (Minimal tiap
kategori ada 5 buku) 
class buku, kategori ada teknologi, dll. */
public class book{
    String judul;
    String kategori;
    String penulis;
    String tahunTerbit;

    public void setJudulBuku(String judulBuku){
        this.judul = judulBuku;
    }
 
    public void setKategoriBuku(String kategoriBuku){
        this.kategori = kategoriBuku;
    }
    
    public void setPenulisBuku(String penulisBuku){
        this.penulis = penulisBuku;
    }
    
    public void setTahunTerbitBuku(String tahunTerbitBuku){
        this.tahunTerbit = tahunTerbitBuku;
    }

    public void display() {
       
        System.out.println("Kategori buku   : " +kategori);
        System.out.println("Judul buku      : " +judul);
        System.out.println("Penulis buku    : " +penulis);
        System.out.println("Tahun terbit    : " +tahunTerbit);
        System.out.println();
    }
}