package br.com.treinamento;

public class Animal {
    
    private String nome;
    private String sobrenome;

    static String nome2;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void imprimirNomeCompleto() {
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
    }
}
