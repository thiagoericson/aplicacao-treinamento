package br.com.treinamento;

import java.util.Locale;
import java.util.Scanner;

public class MediaAlunosDinamico {
    public static void main(String[] args) {
        float notaAluno = 0;
        float totalNota = 0;
        float mediaNota = 0;
        int totalAluno = 0;

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        while (true) {
            System.out.print("Insira uma nota para continuar, ou '-1' para terminar o programa: ");
            notaAluno = entrada.nextFloat();
            if (notaAluno < 0){
                break;
            }
            totalNota += notaAluno;
            totalAluno++;
        }
        entrada.close();

        if (totalNota == 0) {
            System.out.println("Nenhuma nota foi inserida.");
        } else {
            mediaNota = totalNota / totalAluno;
            System.out.println("A nota media da sala, para " + totalAluno + " alunos, foi de: " + mediaNota);
        }
    }
}
