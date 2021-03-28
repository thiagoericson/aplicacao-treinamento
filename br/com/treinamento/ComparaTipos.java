package br.com.treinamento;

public class ComparaTipos {
    public static void main(String[] args) {
        // String nome = "";
        // String nome = null;
        String nome = new String();
        if(nome instanceof String) {
            System.out.println("e uma instancia de String;");
        } else {
            System.out.println("nao e uma instancia de String;");
        }
    }
}
