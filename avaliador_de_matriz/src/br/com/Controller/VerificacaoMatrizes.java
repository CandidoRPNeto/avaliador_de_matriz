package br.com.Controller;

public class VerificacaoMatrizes {
    private VerificacaoMatrizes(){}

    public static boolean verificarSimetricidade(int[][] matriz) {
        int[][] aux = new int [2][2];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                aux[i][j] = matriz[j][i];
            }
        }
        if(aux[0][0] == matriz[1][1] && aux[1][0] == matriz[0][1])
            return true;
        else
            return false;
    }
}
