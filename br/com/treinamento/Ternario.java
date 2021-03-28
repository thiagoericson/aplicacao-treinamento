package br.com.treinamento;

public class Ternario {
    public static void main(String[] args) {
        int a = 0;
        int b = 6;
        int c = 4;

        // variavel = (condicao) ? se true : se false;
        a = b > c ? b : c;

        // equivale a:
        // if (b > c){
        //     a = b;
        // }else {
        //     a = c;
        // }

        System.out.println(a);
    }
}
