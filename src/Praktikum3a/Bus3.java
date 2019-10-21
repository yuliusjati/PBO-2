/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum3a;

/**
 *
 * @author WINDOWS 10
 */
public class Bus3 {

    private double penumpang;
    private double maxpenumpang;
    private int counter;
    private double penumpangBaru;

    public Bus3(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    public void addpenumpang(double penumpang) {
        double temp;
        temp = this.penumpang + penumpang;
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
        counter++;
        penumpangBaru += penumpang;
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("=================");
            System.out.println("Password Benar");
            System.out.println("=================");
        } else {
            System.out.println("=================");
            System.out.println("Password Salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("Berat penumpang Bus sekarang adalah " + penumpang);
        System.out.println("Berat penumpang maksimum seharusnya adalah " + maxpenumpang);
    }
    
     public double getAverage() {
        double r = 0.0;
        r = penumpangBaru / counter;
        return r;
    }

    public void cetak() {
        System.out.println("Average = " + getAverage());
        System.out.println("............................");
        System.out.println("Berat penumpang baru = " + penumpangBaru);
        System.out.println("..........................................");
        System.out.println("Jumlah penumpang = " + counter);
        System.out.println("................................");
    }

}
