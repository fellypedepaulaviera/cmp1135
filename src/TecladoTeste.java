/*
 * PUC Goiás
 * Curso de Analise e Desenvolvimento de Sistemas
 * Professor Heider Taguatinga Farias
 * Turma CMP1006 - Algoritmos e Estruturas de Dados I
 * Projeto CMP1006
 */
package exemplos;

import java.util.Scanner;

import exemplos.classes.Teclado;

/**
 *
 * @author Heider
 */
public class TecladoTeste {
    
    public static void main(String[] args) {
    	float a = Teclado.leiaFloat("Digite um float:");
        System.out.println("Digite um byte:");
        byte b = Teclado.leiaByte();
        System.out.println(b);
        String nome = Teclado.leiaString("Digite seu nome:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        
    }
    
}
