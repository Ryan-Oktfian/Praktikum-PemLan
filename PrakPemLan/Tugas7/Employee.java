package Tugas7;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoice){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoice;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }
    public String getName() {
        return name;
    }
    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }
    public Invoice[] getInvoices() {
        return invoices;
    }

    @Override
    public double getPayableAmount() {
        // TODO Auto-generated method stub
        int payableAmount = 0;
        for (Invoice invoice : invoices) {
            payableAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - payableAmount;
    }

    public void show(){
        double totalBelanja = 0;
        System.out.println("Nama\t\t: " +getName());
        System.out.println("Nomor registrasi: " +getRegistrationNumber());
        System.out.println("Gaji perbulan\t: " +getSalaryPerMonth());
        System.out.println("\n=====================Rincian Belanja=========================");
        System.out.println("Nama Produk\t\tJumlah\t\tHarga");
        for (Invoice invoice : invoices) {
            System.out.println(invoice.getProductName() +"\t\t\t" +invoice.getQuantity() +"\t\t" +invoice.getPricePerItem());
            totalBelanja += invoice.getQuantity() * invoice.getPricePerItem();
        }
        System.out.println("=============================================================");
        System.out.println("Total belanja\t: " +totalBelanja);
        System.out.println("Gaji akhir\t: " +getPayableAmount());
        System.out.println();
    }
}
