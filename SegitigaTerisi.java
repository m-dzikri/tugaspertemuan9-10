/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.no1inheritance;

/**
 *
 * @author HP
 */
public class SegitigaTerisi extends Segitiga{
    private String warna;
    private boolean terisi;

    public SegitigaTerisi(double s1, double s2, double s3, String warna, boolean terisi) {
        super(s1, s2, s3);
        this.warna = warna;
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return super.toString() + ", warna = " + warna + ", terisi = " + terisi;
    }
}
