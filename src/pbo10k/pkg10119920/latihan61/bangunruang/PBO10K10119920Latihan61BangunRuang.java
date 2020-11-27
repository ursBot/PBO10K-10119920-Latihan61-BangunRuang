/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119920.latihan61.bangunruang;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class PBO10K10119920Latihan61BangunRuang {

    public static void main(String[] args) {
        
        DecimalFormat bb = new DecimalFormat("###.#");
        DecimalFormat tb = new DecimalFormat("###");
        DecimalFormat kr = new DecimalFormat("#,###,##0");
        
        BangunRuang bolaBasket, tabung, kerucut;
        
        bolaBasket = new BolaBasket();
        System.out.print("Volume Bola Basket = " + bb.format(bolaBasket.hitungVolume(7.0)) + " cm³");
        System.out.println();
        
        tabung = new Tabung();
        System.out.print("Volume Tabung = " + tb.format(tabung.hitungVolume(10.0)) + " cm³");
        System.out.println();
        
        kerucut = new Kerucut();
        System.out.print("Volume Kerucut = " + kr.format(kerucut.hitungVolume(14.0)).replace("," , ".") + " cm³");
        System.out.println();
    }
}
