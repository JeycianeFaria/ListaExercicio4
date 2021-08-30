package br.com.zup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //variaveis
        int qtdNumeros;
        int contador = 1;
        double numero = 0;
        double soma = 0;
        double media = 0;


        System.out.println("Quantos números você irá digitar");
        qtdNumeros = leitor.nextInt();

        while (contador <= qtdNumeros) {
            System.out.println("Por favor digite o número " + contador);
            numero = leitor.nextDouble();

            soma = soma + numero;

            contador++;

        }

        media = soma / qtdNumeros;

        System.out.println("A média aritmética de todos os numeros digitado é: " + media);

    }

}
