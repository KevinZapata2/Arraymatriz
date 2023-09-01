/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class EjercicioUno {
    public static void main(String[] args) {
        
        Scanner sc=new  Scanner(System.in);
        
        String [][] diasSemana = new String [1][7];
        
        
        
        int semanas = 0;
        while (semanas<7){
        System.out.println("Selecione I");
        int i = sc.nextInt();
        System.out.println("Selecione J");
        int j= sc.nextInt();
        System.out.println("ingrese dia");
        diasSemana [i][j] = sc.next();
        semanas++;
        
        }
        for (int i=0; i<diasSemana.length;i++){
        for (int j=0; j<diasSemana[i].length;j++){
        System.out.println(diasSemana [i][j]);
        }
            
        }        
    }
    
}
