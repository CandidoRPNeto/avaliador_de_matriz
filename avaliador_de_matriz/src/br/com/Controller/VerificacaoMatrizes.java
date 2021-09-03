package br.com.Controller;

public class VerificacaoMatrizes {
    private VerificacaoMatrizes(){}

    public static boolean verificarSimetricidade(int l, int c) {
        if(l == c)
            return true;
        else
            return false;
    }
}
