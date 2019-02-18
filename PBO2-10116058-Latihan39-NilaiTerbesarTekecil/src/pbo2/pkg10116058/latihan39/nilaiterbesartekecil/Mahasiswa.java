/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan39.nilaiterbesartekecil;

import java.util.Scanner;

public class Mahasiswa {

    public int nilai[] = new int[100];

    public int inputNilai(int parNilai[], int parBykMhs) {
        Scanner scan = new Scanner(System.in);

        for (int no = 1; no <= parBykMhs; no++) {
            System.out.print("Nilai Mahasiswa ke-" + no + " : ");
            parNilai[no] = scan.nextInt();
        }
        return 0;
    }

    public int hitungMax(int parNilai[], int parBykMhs) {
        int max = 0;
        for (int no = 1; no <= parBykMhs; no++) {
            if (parNilai[no] > max) {
                max = parNilai[no];
            }
        }
        return max;
    }

    public int hitungMin(int parNilai[], int parBykMhs) {
        int min = 1000;
        for (int no = 1; no <= parBykMhs; no++) {
            if (parNilai[no] < min) {
                min = parNilai[no];
            }
        }
        return min;
    }

    public void tampilBesarKecil(int parNilai[], int parBykMhs) {
        System.out.println("======Hasil Nilai Mahasiswa======");
        for (int no = 1; no <= parBykMhs; no++) {
            System.out.println("Nilai Mahasiswa ke-" + no + " : "
                    + parNilai[no]);
        }
        System.out.println("\n" + "Nilai Terbesar : " + 
                hitungMax(parNilai, parBykMhs));
        System.out.println("Nilai Terkecil : " + 
                hitungMin(parNilai, parBykMhs));

    }

}