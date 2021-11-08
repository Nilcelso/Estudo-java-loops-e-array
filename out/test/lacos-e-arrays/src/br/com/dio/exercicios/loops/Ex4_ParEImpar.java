package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantNumeros;
        int numero;
        int par = 0;
        int impar = 0;
        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 ==0) par += 1;
            else impar +=1;

            count++;
        }while(count < quantNumeros);

        System.out.println(par + " Numero(s) par(es).");
        System.out.println(impar + " Numero(s) impar(es)");


    }
}
