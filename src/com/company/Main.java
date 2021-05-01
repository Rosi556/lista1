package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso;

        System.out.println("Querido usuario por favor informe o seu peso:");
        peso = teclado.nextFloat();

        System.out.println("Agora, Querido usuario, informe sua altura: ");
        float altura = teclado.nextFloat();

        float imc = peso / (altura * altura);

        System.out.printf("Seu imc é %.4f", imc);

    }
}
