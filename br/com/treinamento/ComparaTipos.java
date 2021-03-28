package br.com.treinamento;

public class ComparaTipos {
    public static void main(String[] args) {
        char nome = "X";
        if(nome instanceof String) {
            System.out.println("e String");
        } else {
            System.out.println("Nao e String");
        }
    }
}
