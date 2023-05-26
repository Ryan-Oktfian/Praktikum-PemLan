package Tugas3;

class Hero {
    private String nama;
    private double nyawa;
    private double serangan;
    private double kekebalan;

    public Hero(){}

    public Hero(String nama, double nyawa, double serangan, double kekebalan){
        this.nama = nama;
        this.nyawa = nyawa;
        this.serangan = serangan;
        this.kekebalan = kekebalan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setNyawa(double nyawa) {
        this.nyawa = nyawa;
    }
    public double getNyawa() {
        return nyawa;
    }

    public void setSerangan(double serangan) {
        this.serangan = serangan;
    }
    public double getSerangan() {
        return serangan;
    }

    public void setKekebalan(double kekebalan) {
        this.kekebalan = kekebalan;
    }
    public double getKekebalan() {
        return kekebalan;
    }

    public void serang(Hero lawan){
        System.out.println(this.nama +" menyerang " +lawan.getNama());
        System.out.println();
        System.out.println(this.nama +" menyerang sebesar " +this.serangan);
        System.out.println(lawan.nama +" memiliki pertahanan sebesar " +lawan.getKekebalan());
        if(lawan.getKekebalan()> this.serangan){
            lawan.setNyawa(lawan.getNyawa());
        }
        else{
            lawan.setNyawa(lawan.getNyawa() - (this.getSerangan()-lawan.getKekebalan()));
        }
        System.out.println("Health hero " +lawan.getNama() + " saat ini adalah " + ((lawan.getNyawa() > 0) ? lawan.getNyawa() : 0));
    }
}
