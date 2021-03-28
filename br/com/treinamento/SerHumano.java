package br.com.treinamento;

public class SerHumano {
    public static void main(String[] args){
        Animal objeto1 = new Animal();
        objeto1.setNome("Thiago");
        objeto1.setSobrenome("Ericson");

        Animal objeto2 = new Animal();
        objeto2.setNome("Cabral");
        objeto2.setSobrenome("Cabral");

        objeto1.imprimirNomeCompleto();
        objeto2.imprimirNomeCompleto();
    }
}
