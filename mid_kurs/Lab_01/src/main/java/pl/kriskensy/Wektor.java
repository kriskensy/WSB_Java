package pl.kriskensy;

import java.util.Scanner;

public class Wektor {

    private int wymiar;
    private double[] wspolrzedne;

    public Wektor(int wymiar, double[] wspolrzedne) {
        this.wymiar = wymiar;
        this.wspolrzedne = wspolrzedne;

        for (int i = 0; i < wspolrzedne.length; i++) {
            wspolrzedne[i] = wspolrzedne[i];
        }
    }

    public Wektor(double dane[]) {
        this.wymiar = dane.length;
        this.wspolrzedne = new double[wymiar];

        for (int i = 0; i < wymiar; i++) {
            wspolrzedne[i] = dane[i];
        }
    }

    public Wektor(int n) {
        Scanner scanner = new Scanner(System.in);
        this.wymiar = n;
        this.wspolrzedne = new double[n];

        System.out.println("podaj wspolrzedne wektora: ");
        for (int i = 0; i < n; i++) {
            wspolrzedne[i] = scanner.nextDouble();
        }
    }

    public void show() {
        System.out.print("[");
        for (int i = 0; i < wymiar; i++) {
            System.out.print(wspolrzedne[i]);
            if (i < wymiar - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }

    public double suma() {
        double sum = 0;
        for (int i = 0; i < wymiar; i++) {
            sum += wspolrzedne[i];
        }
        return sum;
    }

    public Wektor add(Wektor w) {
        double[] dodaneWspolrzedne = new double[wymiar];
        for (int i = 0; i < wymiar; i++) {
            dodaneWspolrzedne[i] = this.wspolrzedne[i] + w.wspolrzedne[i];
        }
        return new Wektor(wymiar, dodaneWspolrzedne);
    }
}