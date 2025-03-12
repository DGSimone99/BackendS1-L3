package S1L3.esercizi.esercizio1;

public class Rettangolo {
    private int base;
    private int altezza;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public Rettangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int perimetro() {
        return (base + altezza) * 2;
    }


    public int area() {
        return base * altezza;
    }


    public void stampaRettangolo(int perimetro, int area) {
        perimetro = perimetro();
        area = area();

        System.out.println("Primo Rettangolo:");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }

    public void stampaRettangolo2(int perimetro, int area) {
        perimetro = perimetro();
        area = area();

        System.out.println("Secondo Rettangolo:");
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
