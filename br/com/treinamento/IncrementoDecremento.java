package br.com.treinamento;

public class IncrementoDecremento {
    public static void main(String[] args) {
        int valorPosIncremento = 5;
        int valorPreIncremento = 5;
        int valorPosDecremento = 5;
        int valorPreDecremento = 5;

        System.out.println("Pos Incremento: " + valorPosIncremento++);
        System.out.println(valorPosIncremento);
        System.out.println("Pre Incremento: " + ++valorPreIncremento);
        System.out.println("Pos Decremento: " + valorPosDecremento--);
        System.out.println(valorPosDecremento);
        System.out.println("Pre Decremento: " + --valorPreDecremento);

    }
}
