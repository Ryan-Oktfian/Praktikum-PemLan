package Tugas7;

public class Main {
    public static void main(String[] args) {

        Invoice a = new Invoice("Kemeja", 1, 100000);
        Invoice b = new Invoice("Celana", 1, 150000);
        Invoice c = new Invoice("Sepatu", 1, 700000);
        Invoice d = new Invoice("Sabuk", 1, 50000);
        Invoice e = new Invoice("Dasi", 1, 30000);
        Invoice[] invo1 = {a,b,c,d,e};
        Employee emp1 = new Employee(22515070, "Bose", 5000000, invo1);
        emp1.show();

        Invoice f = new Invoice("Iphone", 1, 100000);
        Invoice g = new Invoice("Casing", 1, 150000);
        Invoice h = new Invoice("Charger", 1, 700000);
        Invoice i = new Invoice("Earphone", 1, 50000);
        Invoice j = new Invoice("Tempered Glass", 1, 30000);
        Invoice[] invo2 = {f,g,h,i,j};
        Employee emp2 = new Employee(22517050, "Baseus", 3000000, invo2);
        emp2.show();
    } 
    
}
