package br.com.treinamento;

public class ListaTabulada {
    public static void main(String[] args) {
        System.out.printf("numero\t quadrado\t cubo\n");
        for (int i = 0; i <= 20; i++) {
            System.out.printf("%d\t %d\t \t%d\n", i, i * i, i * i * i);
        }
    }
}
