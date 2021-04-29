package Aula2;
import java.util.Scanner;

/*MÓDULO+STRING: Você está com necessidade de fazer uma grana extra e resolveu escrever trabalhos nas normas da ABNT para os colegas. Segundo a norma a bibliografia deve iniciar pelo nome do autor, porém em um formato especial ou seja, primeiro o sobrenome, uma vírgula e então as iniciais do nome seguidas de um ponto. Exemplo: Se o autor se chamar José Augusto Silva o sistema deve exibir SILVA, J. A. Faça um programa que recebe o nome do autor e depois exibe o nome no formato ABNT. Esse programa deve conter um módulo que receba o nome e devolva o nome formatado.*/
public class ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;

        System.out.println("Insira o seu nome completo");
        nome = input.nextLine();
        System.out.println("Padrao ABNT: " + fazerABNT(nome));
    }
    public static String fazerABNT(String nomecompleto) {
        String[] ABNT = nomecompleto.split(" ");
        String padrao = "";

        padrao = (ABNT[ABNT.length - 1].toUpperCase() + ", ");
        for (int i = 0; i < ABNT.length - 1; i++) {
            padrao += (ABNT[i].toUpperCase().charAt(0) + ".");
        }
        return padrao;
    }
}
