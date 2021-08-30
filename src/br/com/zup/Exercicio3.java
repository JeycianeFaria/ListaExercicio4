package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variáveis
        int contador = 1;
        int qtdDeNumeros = 5;
        int soma = 0;
        int numero;


        System.out.println("Por favor, digite 5 números");
        while(contador <= qtdDeNumeros){
            System.out.println("Digite o número " + contador);
            numero = leitor.nextInt();

            soma = soma + numero;

            contador++;

        }

        System.out.println("O resultado da soma dos 5 números que você digitou é de " + soma);
    }

}
