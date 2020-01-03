package com.rizkykhapidsyah.fdmii;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("PENGENALAN FUNGSI/METHOD");
        System.out.println("-------------------------");

        int X, Y;

        X = 17;
        Y = Hitung(X);
        System.out.println("X = " + X + ", Y = " + Y);

        X = 30;
        Y = Hitung(X);
        System.out.println("X = " + X + ", Y = " + Y);

        X = 44;
        Y = Hitung(X);
        System.out.println("X = " + X + ", Y = " + Y);
    }

    static int Hitung(int Input) {
        int Hasil;

        Hasil = (Input + 2) * Input;
        return Hasil;
    }
}
