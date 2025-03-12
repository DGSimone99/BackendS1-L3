package S1L3.esercizi.esercizio1;

import java.util.Scanner;


public class MainRettangolo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rettangolo rett1 = new Rettangolo(20, 5);
        Rettangolo rett2 = new Rettangolo(10, 6);

        System.out.println("Inserisci base");
        rett1.setBase(scanner.nextInt());

        System.out.println("Inserisci altezza");
        rett1.setAltezza(scanner.nextInt());

        System.out.println("Inserisci la base del secondo rettangolo");
        rett2.setBase(scanner.nextInt());

        System.out.println("Inserisci l'altezza del secondo rettangolo");
        rett2.setAltezza(scanner.nextInt());

        rett1.stampaRettangolo(rett1.perimetro(), rett1.area());
        rett2.stampaRettangolo(rett2.perimetro(), rett2.area());

        System.out.println("La somma dei perimetri è " + (rett1.perimetro() + rett2.perimetro()));
        System.out.println("La somma delle aree è " + (rett1.area() + rett2.area()));

    }
}
