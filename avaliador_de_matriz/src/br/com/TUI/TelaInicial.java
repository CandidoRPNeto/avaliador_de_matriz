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
        System.out.println("Insira a linha e a coluna da matriz nessa ordem");
        System.out.println("Para encerrar o programa digite um valor negativo");
        int aux = 0;
        int aux2 = 0;
        int v1 = 0;
        int v2 = 0;
        String result = "";

        while(aux >= 0 ){
            aux2++;
            aux = s.nextInt();
            v1 = aux;
            if (v1 >= 0){
                aux = s.nextInt();
                v2 = aux;
                if (v2 >= 0)
                    result += aux2 + " - " + VerificacaoMatrizes.verificarSimetricidade(v1,v2) + "\n";
            }
        }
        System.out.println(result);
    }

}
