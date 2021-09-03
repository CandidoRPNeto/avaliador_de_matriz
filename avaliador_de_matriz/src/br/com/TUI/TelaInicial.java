package br.com.TUI;

import java.util.Scanner;

import br.com.Controller.VerificacaoMatrizes;

public class TelaInicial {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
       iniciar();    
    }

    public static void iniciar(){
        System.out.println("Bem Vindo");
        System.out.println("Insira os valores: ");
        int[][] matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Insira o valor da linha "+i+" e da coluna "+j + ": ");
                matriz[i][j] = s.nextInt();
            }
        }
        if (VerificacaoMatrizes.verificarSimetricidade(matriz))
            System.out.println("E simetrica");
        else
            System.out.println("Não e simetrica");
    }

}
