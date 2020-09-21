package com.company;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*

        for(int i=0,j=0;i<10;i++,j--) {
            System.out.println(i);
        }

        int a = 5;
        while(a<5) {
            a--;
        }

        do {
            a++;
        } while(a<5);


        int j = 0;
        while(true) {

            if(j == 5) break;  // выход из цикла

        }

        for(int k=0;k<20;k++) {
            if(k == 6) continue; //  переход к след. итер.
                // какой-то код
        }

        // 0 1 2 3 4
        int[] n = new int[5]; // 0 0 0 0 0
        for(int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }
        n[4] = 7;
        //foreach
        for(int v: n) System.out.println(v);


        int z = scan.nextInt();
        double[] y = new double[z];
        for(int i=0;i<z;i++) {
            y[i] = scan.nextDouble();
        }


        int[] p1 = {5,4343,3,4,-78,23};
        // p1.length
        // p1[2] // 3
        int[][] p = new int[4][3];
        int[][] p2 = { {1,3}, {5,12} };
        for(int i=0;i<2;i++) {
            for(int l=0;l<2;l++) {
                System.out.print(p2[i][l] + " ");
            }
            System.out.println();
        }

*/
        Scanner scan = new Scanner(System.in);
        int key = scan.nextInt();
        switch(key) {
            case 100:
                System.out.println(key);
                break;
            case 90:
                System.out.println(key);
                break;
            case 9:
                System.out.println(key);
                   break;
            default:
                break;

        }






        /*

        int[][] aa = new int[5][];
        for(int f = 0;f<aa.length;f++) {
            Random r = new Random();
            aa[f] = new int[r.nextInt(5)+1];
        }
        //Math.random();
        for(int q=0;q<5;q++) {
            for(int w=0;w<aa[q].length;w++) {
               System.out.print(aa[q][w] + " ");
            }
            System.out.println();
        }
        */
    }
}
