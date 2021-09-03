package br.com.Controller;

public class VerificacaoMatrizes {
    private VerificacaoMatrizes(){}

    public static boolean verificarSimetricidade(int[][] matriz) {
        int[][] aux = new int [2][2];
        int validador = 0;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aux[i][j] = matriz[j][i];
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if(aux[i][j] == matriz[i][j]){
                    validador++;
                }
            }
        }
        if(validador == 4)
            return true;
        else
            return false;
    }
}
