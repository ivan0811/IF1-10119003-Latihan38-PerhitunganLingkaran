package com.ivanfaathirza.perhitunganlingkaran;

import java.util.Scanner;

public class Latihan38PerhitunganLingkaran {
    static Scanner scan = new Scanner(System.in);
    private static double dimeterLingkaran;

    private static void validasi(String diameter){
        if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            masukkanDiameter();
        }else{
            dimeterLingkaran = Double.parseDouble(diameter);
        }
    }

    private static void masukkanDiameter(){
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        validasi(scan.next());
    }
    

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        masukkanDiameter();
        lingkaran.hitung(dimeterLingkaran);
        System.out.println("Developed by : Ivan Faathirza");
    }
}
