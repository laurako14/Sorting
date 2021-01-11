/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rusiavimas;

/**
 *
 * @author User
 */
public class Rusiavimas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};

        int reiksme = 0;
        for (int i = 0; i < masyvas.length; i++) {
            for (int k = i; k < masyvas.length; k++) {
                if (masyvas[i] < masyvas[k]) {
                    reiksme = masyvas[k];
                    masyvas[k] = masyvas[i];
                    masyvas[i] = reiksme;
                }
            }
        }
        for (int j = 0; j < masyvas.length; j++) {
            System.out.print(masyvas[j] + " ");
        }
        
        System.out.println("");
        
        int didesnis = 0;
        for (int l = 0; l < masyvas.length; l++) {
            for (int m = l; m < masyvas.length; m++) {
                if (masyvas[m] < masyvas[l]) {
                    didesnis = masyvas[l];
                    masyvas[l] = masyvas[m];
                    masyvas[m] = didesnis;
                }
            }
        }
        for (int j = 0; j < masyvas.length; j++) {
            System.out.print(masyvas[j] + " ");
        }
    }

}
