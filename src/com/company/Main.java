package com.company;

public class Main {

    public static void main(String[] args) {
        double[] klass = new double[25];
        // массив со средним баллом
        int a = 2;
        int b = 10;
        int c = 0;
        double d = 0;
        for (int i = 0; i < klass.length; i++) {
            d = ((Math.random() * (b - a + 1)) + a) * 100;
            c = (int) Math.round(d);
            d = (double) c;
            klass[i] = d > 1000 ? 10 : d / 100;
            System.out.println((i + 1) + "-ый ученик. Средний балл - " + klass[i]);
        }
        //Выводим отличник хорошист и двоечник
        for (int i = 0; i < klass.length; i++) {
            if (klass[i] >=9) {
                System.out.println((i + 1) + "-ый ученик отличник");
            }
            else if (klass[i] >= 6 && klass[i] <9) {
                System.out.println((i + 1) + "-ый ученик хорошист");
            }
            else if (klass[i] < 6) {
                System.out.println((i + 1) + "-ый ученик двоечник");
            }
        }
    }
}
