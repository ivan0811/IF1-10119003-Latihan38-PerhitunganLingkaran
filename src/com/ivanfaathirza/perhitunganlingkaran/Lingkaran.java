package com.ivanfaathirza.perhitunganlingkaran;

import java.util.Locale;

public class Lingkaran {
    Locale locale = Locale.forLanguageTag("id");
    private final double pi = Math.PI;
    private double luas, jariJari, diameter, keliling;

    private double hitungLuas(){
        return pi * Math.pow(jariJari, 2);
    }

    private double hitungJariJari(){ return diameter / 2; }

    private double hitungKeliling(){
        return 2 * pi * jariJari;
    }

    private void tampil(double luas, double jariJari, double keliling){
        System.out.println("\n====Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+jariJari+" cm");
        System.out.printf(locale, "Luas Lingkaran = %.2f cm%n", luas);
        System.out.printf(locale,"Keliling Lingkaran = %.2f cm%n", keliling);
    }

    public void hitung(double diameterLingkaran){
        diameter = diameterLingkaran;
        jariJari = hitungJariJari();
        luas = hitungLuas();
        keliling = hitungKeliling();
        tampil  (luas, jariJari, keliling);
    }

}
