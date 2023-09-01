/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class ArrayMatrices {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int [][] numeros = {{4,9,8},{2,3,1},{7,5,0}};
        for (int i=0; i<numeros.length;i++){
        for (int j=0; j<numeros[i].length;j++)
            System.out.println(numeros [i] [j]);
        }
        System.out.println("\n");
    }
}
