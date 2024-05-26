package pl.kriskensy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //zadanie 1
//        System.out.println(Czytacz.dajString());
//        System.out.println(Czytacz.dajDouble());
//        System.out.println(Czytacz.dajInt());

//        //zadanie 5
//        String thisIsString = "5";
//        int thisIsInteger = 17;
//        double thisIsDouble = 33.9;
//
//        System.out.println(Konwerter.stringToDouble(thisIsString));
//        System.out.println(Konwerter.doubleToString(thisIsDouble));
//        System.out.println(Konwerter.intToString(thisIsInteger));
//        System.out.println(Konwerter.stringToInt(thisIsString));

        //zadanie 6
        Scanner scanner = new Scanner(System.in);

        double[] wspolrzedneWektor1 = {5.0, 3.5, 4.5, 10.0};
        double[] wspolrzedneWektor2 = {7.0, 6.0, 2.5, 4.5};

        Wektor wektor1 = new Wektor(wspolrzedneWektor1);
        Wektor wektor2 = new Wektor(wspolrzedneWektor2);

        wektor1.show();
        wektor2.show();

        System.out.println("sumy pojedynczych wektorow: ");
        System.out.println(wektor1.suma());
        System.out.println(wektor2.suma());

        System.out.println("suma wektorow: ");
        Wektor sumaWektorow = wektor1.add(wektor2);
        System.out.println(sumaWektorow.suma());

        Wektor wektorZKonsoli = new Wektor(3);
        wektorZKonsoli.show();
        System.out.println(wektorZKonsoli.suma());
    }
}