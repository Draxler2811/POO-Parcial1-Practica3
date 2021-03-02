/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author ol196
 */
public class Practica3Arreglos {
    private  int numero[],nElementos, aux;
        Scanner sc = new Scanner(System.in);
        
        public void Entrada(){
        System.out.println("Introduce la cantidada de nuemros a editar  ");
        nElementos=Integer.parseInt(sc.nextLine());
        numero = new int[nElementos];
        
        for(int i=0; i<nElementos;i++){
            System.out.println((i+1) + ". Pon un numero: ");
        numero[i] = sc.nextInt();
        }
        for(int i=0; i<nElementos-1; i++){
            for(int j=0; j<nElementos-1; j++){
                if(numero[j] > numero[j+1]){
                    aux = numero[j];
                    numero[j]=numero[j+1];
                    numero[j+1]=aux;
                }
            }
        }
      }
        public void Resultado(){
        System.out.println("\nNumero ordenado");
        for(int i=0; i<nElementos; i++){
            System.out.println(numero[i] + ";");
        }
    }
}
