package com.rizkykhapidsyah.fdmii;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //Void artinya Tidak Mengembalikan Nilai

        String Y = "Kamu!";
        int X = 7;

        SelamatPagi(Y);
        System.out.print("Hasil Print dari Fungsi Void      : "); FungsiVoid(Y);
        System.out.println(FungsiDenganNilaiKembalian(X));
    }

    private static void SelamatPagi(String Nama) {
        System.out.println("Halo, Selamat Pagi " + Nama);
    }

    //Fungsi Atau Method Tanpa Nilai Kembalian
    private static void FungsiVoid(String Input) {
        System.out.println(Input);
    }

    /*  Fungsi atau Method Dengan Nilai Kembalian
        Sehingga menggunakan return untuk
        Mengembalikan Nilainya.
     */
    private static int FungsiDenganNilaiKembalian(int A) {
        return A;
    }
}
