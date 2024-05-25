/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.no1inheritance;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class No1inheritance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan panjang sisi 1 segitiga: ");
        double sisi1 = input.nextDouble();
        System.out.println("Masukkan panjang sisi 2 segitiga: ");
        double sisi2 = input.nextDouble();
        System.out.println("Masukkan panjang sisi 3 segitiga: ");
        double sisi3 = input.nextDouble();

        System.out.println("Masukkan warna segitiga: ");
        String warna = input.next();

        System.out.println("Apakah segitiga terisi? (true/false): ");
        boolean terisi = input.nextBoolean();

        SegitigaTerisi segitiga = new SegitigaTerisi(sisi1, sisi2, sisi3, warna, terisi);

        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getPerimeter());
        System.out.println(segitiga);

        input.close();
    }
}
